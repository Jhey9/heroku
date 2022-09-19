package starter.userinterface;

import net.serenitybdd.screenplay.targets.Target;

public class IframeUserInterface {

    public static final Target CONTENT_BODY = Target.the("Content body").locatedBy("#tinymce");
    public static final Target MENUITEM_EDIT = Target.the("Menu option Edit").locatedBy("//span[@class='tox-mbtn__select-label' and . ='Edit']");
    public static final Target SELECT_ALL = Target.the("Select all text").locatedBy("//div[@class='tox-collection__item-label' and .='Select all']");

    public static final Target LIST_STYLE_PARAGRAPH = Target.the("List of style Paragraph").locatedBy("//div[@class='tox-toolbar__group']//button[@title='Formats']");
    public static final Target SUB_MENU_LIST_STYLE_PARAGRAPH = Target.the("Sub menu of list Paragraph").locatedBy("//div[@title='{0}']");
    public static final Target OPTION_LIST = Target.the("option of style of Headings").locatedBy("//div[@title='{0}']");
    public static final Target MENU_FORMAT = Target.the("Menu format").locatedBy("//span[@class='tox-mbtn__select-label' and .='Format']");

    public static final Target SUB_MENU_TEXT_COLOR = Target.the("Menu text color").locatedBy("//div[@class='tox-collection__item-label' and .='Text color']");

    public static final Target COLOR = Target.the("color the text").locatedBy("//div[@title='{0}']");



}
