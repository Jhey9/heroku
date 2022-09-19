package starter.interactions;

import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;

import static starter.userinterface.IframeUserInterface.*;

public class Change {
    public static Interaction letterSizeIframe(String typeSize) {
        return Interaction.where("{0} change the letter size",
                Click.on(LIST_STYLE_PARAGRAPH),
                MoveMouse.to(SUB_MENU_LIST_STYLE_PARAGRAPH.of("Headings")),
                Click.on(OPTION_LIST.of(typeSize))

        );
    }

    public static Interaction allFontTextIframe(String typeInline) {
        return Interaction.where("{0} change font text",
                Click.on(LIST_STYLE_PARAGRAPH),
                MoveMouse.to(SUB_MENU_LIST_STYLE_PARAGRAPH.of("Inline")),
                Click.on(OPTION_LIST.of(typeInline))

        );
    }

    public static Interaction allColorTextIframe(String color) {
        return Interaction.where("{0} change color",
                Click.on(MENU_FORMAT),
                MoveMouse.to(SUB_MENU_TEXT_COLOR),
                Click.on(COLOR.of(color))
                );
    }

    public static Interaction AllAlignTextIframe(String optionAlign) {
        return Interaction.where("{0} Change the Align",

                Click.on(LIST_STYLE_PARAGRAPH),
                MoveMouse.to(SUB_MENU_LIST_STYLE_PARAGRAPH.of("Align")),
                Click.on(OPTION_LIST.of(optionAlign))
                );
    }
}