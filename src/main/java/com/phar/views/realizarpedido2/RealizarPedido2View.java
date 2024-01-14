package com.phar.views.realizarpedido2;

import com.phar.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.dependency.Uses;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.NumberField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("Realizar Pedido2")
@Route(value = "realizar-Pedido2", layout = MainLayout.class)
@Uses(Icon.class)
public class RealizarPedido2View extends Composite<VerticalLayout> {

    public RealizarPedido2View() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        H1 h1 = new H1();
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        NumberField numberField = new NumberField();
        DatePicker datePicker = new DatePicker();
        HorizontalLayout layoutRow2 = new HorizontalLayout();
        Button buttonPrimary = new Button();
        Button buttonSecondary = new Button();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        H2 h2 = new H2();
        H3 h3 = new H3();
        H2 h22 = new H2();
        H3 h32 = new H3();
        H2 h23 = new H2();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.setWidthFull();
        getContent().setFlexGrow(1.0, layoutRow);
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        layoutColumn2.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutColumn2);
        layoutColumn2.setWidth("565px");
        layoutColumn2.getStyle().set("flex-grow", "1");
        h1.setText("Realizar Pedido");
        h1.setWidth("max-content");
        textField.setLabel("Nombre del Proveedor");
        textField.setWidth("266px");
        textField2.setLabel("Producto");
        textField2.setWidth("266px");
        numberField.setLabel("Cantidad de Productos");
        numberField.setWidth("266px");
        datePicker.setLabel("Fecha");
        datePicker.setWidth("266px");
        layoutRow2.setWidthFull();
        layoutColumn2.setFlexGrow(1.0, layoutRow2);
        layoutRow2.addClassName(Gap.MEDIUM);
        layoutRow2.setWidth("100%");
        layoutRow2.getStyle().set("flex-grow", "1");
        buttonPrimary.setText("Guardar");
        buttonPrimary.setWidth("min-content");
        buttonPrimary.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonSecondary.setText("Cancelar");
        buttonSecondary.setWidth("min-content");
        layoutColumn3.setHeightFull();
        layoutRow.setFlexGrow(1.0, layoutColumn3);
        layoutColumn3.setWidth("100%");
        layoutColumn3.getStyle().set("flex-grow", "1");
        h2.setText("Numero de Pedido");
        h2.setWidth("max-content");
        h3.setText("Heading");
        h3.setWidth("max-content");
        h22.setText("Estado del Pedido");
        h22.setWidth("max-content");
        h32.setText("Heading");
        h32.setWidth("max-content");
        h23.setText("Detalles");
        h23.setWidth("max-content");
        getContent().add(layoutRow);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(h1);
        layoutColumn2.add(textField);
        layoutColumn2.add(textField2);
        layoutColumn2.add(numberField);
        layoutColumn2.add(datePicker);
        layoutColumn2.add(layoutRow2);
        layoutRow2.add(buttonPrimary);
        layoutRow2.add(buttonSecondary);
        layoutRow.add(layoutColumn3);
        layoutColumn3.add(h2);
        layoutColumn3.add(h3);
        layoutColumn3.add(h22);
        layoutColumn3.add(h32);
        layoutColumn3.add(h23);
    }
}
