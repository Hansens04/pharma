package com.phar.views;


import com.phar.views.consultarproductosabastecer.ConsultarProductosAbastecerView;
import com.phar.views.ingresarproductos.IngresarProductosView;
import com.phar.views.ingresarproveedor.IngresarProveedorView;
import com.phar.views.modificarproducto.ModificarProductoView;
import com.phar.views.modificarproveedor.ModificarProveedorView;
import com.phar.views.realizarpedido2.RealizarPedido2View;
import com.phar.views.visualizarproductosstock.VisualizarProductosStockView;
import com.phar.views.visualizarproveedor.VisualizarProveedorView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.Nav;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.html.UnorderedList;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.theme.lumo.LumoUtility.AlignItems;
import com.vaadin.flow.theme.lumo.LumoUtility.BoxSizing;
import com.vaadin.flow.theme.lumo.LumoUtility.Display;
import com.vaadin.flow.theme.lumo.LumoUtility.FlexDirection;
import com.vaadin.flow.theme.lumo.LumoUtility.FontSize;
import com.vaadin.flow.theme.lumo.LumoUtility.FontWeight;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;
import com.vaadin.flow.theme.lumo.LumoUtility.Height;
import com.vaadin.flow.theme.lumo.LumoUtility.ListStyleType;
import com.vaadin.flow.theme.lumo.LumoUtility.Margin;
import com.vaadin.flow.theme.lumo.LumoUtility.Overflow;
import com.vaadin.flow.theme.lumo.LumoUtility.Padding;
import com.vaadin.flow.theme.lumo.LumoUtility.TextColor;
import com.vaadin.flow.theme.lumo.LumoUtility.Whitespace;
import com.vaadin.flow.theme.lumo.LumoUtility.Width;
import org.vaadin.lineawesome.LineAwesomeIcon;

/**
 * The main view is a top-level placeholder for other views.
 */
public class MainLayout extends AppLayout {

    /**
     * A simple navigation item component, based on ListItem element.
     */
    public static class MenuItemInfo extends ListItem {

        private final Class<? extends Component> view;

        public MenuItemInfo(String menuTitle, Component icon, Class<? extends Component> view) {
            this.view = view;
            RouterLink link = new RouterLink();
            // Use Lumo classnames for various styling
            link.addClassNames(Display.FLEX, Gap.XSMALL, Height.MEDIUM, AlignItems.CENTER, Padding.Horizontal.SMALL,
                    TextColor.BODY);
            link.setRoute(view);

            Span text = new Span(menuTitle);
            // Use Lumo classnames for various styling
            text.addClassNames(FontWeight.MEDIUM, FontSize.MEDIUM, Whitespace.NOWRAP);

            if (icon != null) {
                link.add(icon);
            }
            link.add(text);
            add(link);
        }

        public Class<?> getView() {
            return view;
        }

    }

    public MainLayout() {
        addToNavbar(createHeaderContent());
        setDrawerOpened(false);
    }

    private Component createHeaderContent() {
        Header header = new Header();
        header.addClassNames(BoxSizing.BORDER, Display.FLEX, FlexDirection.COLUMN, Width.FULL);

        Div layout = new Div();
        layout.addClassNames(Display.FLEX, AlignItems.CENTER, Padding.Horizontal.LARGE);

        H1 appName = new H1("Farmacia");
        appName.addClassNames(Margin.Vertical.MEDIUM, Margin.End.AUTO, FontSize.LARGE);
        layout.add(appName);

        Nav nav = new Nav();
        nav.addClassNames(Display.FLEX, Overflow.AUTO, Padding.Horizontal.MEDIUM, Padding.Vertical.XSMALL);

        // Wrap the links in a list; improves accessibility
        UnorderedList list = new UnorderedList();
        list.addClassNames(Display.FLEX, Gap.SMALL, ListStyleType.NONE, Margin.NONE, Padding.NONE);
        nav.add(list);

        for (MenuItemInfo menuItem : createMenuItems()) {
            list.add(menuItem);

        }

        header.add(layout, nav);
        return header;
    }

    private MenuItemInfo[] createMenuItems() {
        return new MenuItemInfo[]{ //
                new MenuItemInfo("Ingresar Proveedor", LineAwesomeIcon.USER.create(), IngresarProveedorView.class), //

                new MenuItemInfo("Modificar Proveedor", LineAwesomeIcon.USER.create(), ModificarProveedorView.class), //

                new MenuItemInfo("Visualizar Proveedor", LineAwesomeIcon.QQ.create(), VisualizarProveedorView.class), //

                new MenuItemInfo("Realizar Pedido2", LineAwesomeIcon.PENCIL_RULER_SOLID.create(),
                        RealizarPedido2View.class), //

                new MenuItemInfo("Consultar Productos Abastecer", LineAwesomeIcon.AMBULANCE_SOLID.create(),
                        ConsultarProductosAbastecerView.class), //

                new MenuItemInfo("Ingresar Productos", LineAwesomeIcon.NOTES_MEDICAL_SOLID.create(),
                        IngresarProductosView.class), //

                new MenuItemInfo("Modificar Producto", LineAwesomeIcon.NOTES_MEDICAL_SOLID.create(),
                        ModificarProductoView.class), //

                new MenuItemInfo("Visualizar Productos Stock", LineAwesomeIcon.STORE_ALT_SOLID.create(),
                        VisualizarProductosStockView.class), //

        };
    }

}
