package com.michau.ui;


import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasElement;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.JsModule;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.AfterNavigationEvent;
import com.vaadin.flow.router.AfterNavigationObserver;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLayout;
import com.vaadin.flow.server.VaadinSession;
import de.kaesdingeling.hybridmenu.components.BreadCrumbs;
import de.kaesdingeling.hybridmenu.components.LeftMenu;
import de.kaesdingeling.hybridmenu.components.NotificationCenter;
import de.kaesdingeling.hybridmenu.components.TopMenu;
import de.kaesdingeling.hybridmenu.data.DefaultViewChangeManager;
import de.kaesdingeling.hybridmenu.data.MenuConfig;
import de.kaesdingeling.hybridmenu.data.interfaces.HybridMenuRouter;
import de.kaesdingeling.hybridmenu.data.interfaces.MenuComponent;
import de.kaesdingeling.hybridmenu.data.interfaces.TopMenuButtons;
import de.kaesdingeling.hybridmenu.data.interfaces.ViewChangeManager;
import de.kaesdingeling.hybridmenu.utils.Styles;
import jdk.nashorn.internal.objects.annotations.Getter;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * A Designer generated component for the main-view template.
 * <p>
 * Designer will add and remove fields with @Id mappings but
 * does not overwrite or otherwise change this file.
 */
@Route("main-view")
public class MainView extends VerticalLayout implements RouterLayout, AfterNavigationObserver, HybridMenuRouter {
    private static final long serialVersionUID = -4055770717384786366L;


    private ViewChangeManager viewChangeManager = new DefaultViewChangeManager();
 private MenuConfig config = null;
    private boolean buildRunning = false;

    /* Components */
    private HorizontalLayout content = new HorizontalLayout();
    private BreadCrumbs breadCrumbs = null;
    private VerticalLayout rootContent = new VerticalLayout();
   private TopMenu topMenu = new TopMenu();
 private LeftMenu leftMenu = new LeftMenu();
  private NotificationCenter notificationCenter = new NotificationCenter();

    private List<Component> tempTopMenuComponents = new ArrayList<Component>();

    protected MainView() {
        setSizeFull();
        getClassNames().add(Styles.hybridMenu);
        setMargin(false);
        setPadding(false);
        setSpacing(false);

        VaadinSession.getCurrent().setAttribute(MenuConfig.class, MenuConfig.builder().build());

        boolean build = init(VaadinSession.getCurrent(), UI.getCurrent());

        if (build) {
            build();
        }
    }

    public MainView build() {
        if (!buildRunning) {
            content.setSizeFull();
            content.setMargin(false);
            content.setSpacing(false);
            content.getClassNames().add(Styles.rootContent);
            content.add(leftMenu, notificationCenter);

            add(topMenu, content);
            expand(content);

            if (config.isBreadcrumbs()) {
                rootContent.add(getBreadCrumbs());
            }

            rootContent.setWidth("100%");
            rootContent.setHeight("100%");
            rootContent.setMargin(false);
            rootContent.setPadding(false);
            rootContent.setSpacing(false);

            content.add(rootContent);
            content.expand(rootContent);

            notificationCenter.setNotificationPosition(config.getNotificationPosition());

            VaadinSession.getCurrent().setAttribute(MenuConfig.class, config);
            VaadinSession.getCurrent().setAttribute(MainView.class, this);
            buildRunning = true;
        }
        return this;
    }

    public BreadCrumbs getBreadCrumbs() {
        if (breadCrumbs == null) {
            breadCrumbs = new BreadCrumbs();
        }

        return breadCrumbs;
    }

    public MainView withConfig(MenuConfig config) {
        VaadinSession.getCurrent().setAttribute(MenuConfig.class, config);
        this.config = config;
        return this;
    }

    public void setViewChangeManager(ViewChangeManager viewChangeManager) {
        this.viewChangeManager = viewChangeManager;
    }

    @Override
    public void showRouterLayoutContent(HasElement content) {
        clearTempTopMenu();
        if (content != null) {
            Component component = content.getElement().getComponent().get();

            content.getElement().getStyle().set("width", "100%");
            content.getElement().getClassList().add(Styles.contentBox);

            if (!config.isBreadcrumbs()) {
                component.getElement().getClassList().add(Styles.paddingTopContent);
            }

            this.rootContent.add(component);
            this.rootContent.expand(component);

            if (component instanceof TopMenuButtons) {
                setTempTopMenu((TopMenuButtons) component);
            }
        }
    }

    private void setTempTopMenu(TopMenuButtons topMenuButtons) {
        tempTopMenuComponents = topMenuButtons.topMenuButtons(tempTopMenuComponents);
        for (Component component : tempTopMenuComponents) {
            topMenu.add(component);
        }
    }

    private void clearTempTopMenu() {
        for (Component component : tempTopMenuComponents) {
            topMenu.remove(component);
        }
        tempTopMenuComponents.clear();
    }

    @Override
    public void afterNavigation(AfterNavigationEvent event) {
//        List<MenuComponent<?>> menuContentList = viewChangeManager.init(MainView.this);
//        viewChangeManager.manage(MainView.this, leftMenu, event, menuContentList);
//        viewChangeManager.manage(MainView.this, topMenu, event, menuContentList);
//        viewChangeManager.finish(MainView.this, menuContentList);
    }

    public static String fileToString(File file)  {
        StringBuilder result = new StringBuilder("");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result.append(line).append("\n");
            }

            scanner.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        return result.toString();
    }

    public static InputStream fileToInputStream(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    public static File getFile(String fileName) {
        return new File(MainView.class.getClassLoader().getResource(fileName).getFile());
    }

    @Override
    public boolean init(VaadinSession vaadinSession, UI ui) {
        return false;
    }
}
