/*
    * ENGLISH LANGUAGE VERSION:
    * Java plugin powered by Timofeheus (tmf315@gmail.com)!
    * (C) Timoha Timohavich (and Timofeheus).
    * The program code of this plugin (as well as the plugin itself) for the Minecraft server is distributed free of charge,
    * but when copying the code and / or its parts,
    * you are obliged in the comments to code indicate the author's email (timofeheus@gmail.com),
    * the name of this plugin (HelloWorldTimoha) and / or a link to the plugin/code in GITHUB!
    * (The author of the plugin) I've been doing ANSI color table (and plugin) so please
    * specify in your code that you took ANSI table from this code/plugin in accordance with the requirements given above.
    * ----------------------------------------------------------------------------------------------
    * RUSSIAN LANGUAGE VERSION:
    * Ява (Java) плагин сделан Тимофехеус'ом (tmf315@gmail.com)!
    * (C) Тимоха Тимохавич (и Тимофехеус).
    * Программный код этого плагина (как и сам плагин) для minecraft сервер распространяется бесплатно,
    * но при копировании кода и / или его части,
    * Вы обязаны в комментариях к коду указать E-mail автора (timofeheus@gmail.com),
    * название этого плагина (HelloWorldTimoha) и / или ссылку на плагин/код в GITHUB!
    * (Автор плагина) Я долго делал ANSI таблицу цветов (и плагин) поэтому, пожалуйста,
    * укажи в своём коде, что ты взял ANSI таблицу из этого кода/плагина в соответствии с требованиями приведёнными выше.
*/

/*
    * Created 1 February 2018. The plugin is in development! | Создан в 1 феврале, 2018 году. Плагин находится в разработке!
*/


package ru.timofeheus.HelloWorldPlugin; //The name of the package | Имя пакета

//Libraries | Библиотеки
import java.util.logging.Logger; //The standard Java library | Стандартная библиотека Java
import org.bukkit.plugin.java.JavaPlugin; //Library from Bukkit Api | Библиотека из Bukkit Api | Mandatory library! | Обязательная библиотека!

public class Main_HelloWorld extends JavaPlugin { //Main class | Главный класс

    //Variables for working console color | Переменные для работы цветной консоли
    private static final String COL_RESET = "\u001B[0m";
    private static final String COL_BLACK = "\u001B[30m";
    private static final String COL_GREY = "\u001B[30;1m";
    private static final String COL_RED = "\u001B[31m";
    private static final String COL_RED_LIGHT = "\u001B[31;1m";
    private static final String COL_GREEN = "\u001B[32m";
    private static final String COL_GREEN_LIGHT = "\u001B[32;1m";
    private static final String COL_YELLOW = "\u001B[33m";
    private static final String COL_YELLOW_LIGHT = "\u001B[33;1m";
    private static final String COL_BLUE = "\u001B[34m";
    private static final String COL_BLUE_LIGHT = "\u001B[34;1m";
    private static final String COL_PURPLE = "\u001B[35m";
    private static final String COL_PURPLE_LIGHT = "\u001B[35;1m";
    private static final String COL_CYAN = "\u001B[36m";
    private static final String COL_CYAN_LIGHT = "\u001B[36;1m";
    private static final String COL_WHITE = "\u001B[37m";

    //Variables for code shortening | Переменные для сокращения кода
    private static final String SPACE = " "; //Space, just in the form of a variable | Пробел, просто в виде переменной
    private static final String COMMA_RES = COL_RESET + "," + SPACE; //Comma with reset the colors and space
    private static final String PLUGIN_NAME_COLORED = COL_GREY + "[" + COL_CYAN + "Hello" + COL_BLUE + "World" + COL_GREY + "]"; //The color of the plugin name | Цветное название плагина
    private static final String PLUGIN_TEST_COLORS_PREFIX = COL_GREY + "[" + COL_CYAN + "Colors" + COL_BLUE + "Test" + COL_GREY + "]"; //Color the prefix of a test colors | Цветной префикс теста цветов

    private Logger logger = getLogger(); //Change the default logging features | Изменение стандартной функции логирования

    @Override
    public void onEnable(){ //The function of the plug-in startup - it made the action | Функция при запуске плагина - здесь совершаются действия
        logger.info(

                String.format("%s[%sHello%sWorld%s] %sPlugin set OFF!%s", COL_GREY, COL_CYAN, COL_BLUE, COL_GREY, COL_GREEN, COL_RESET) //Displaying a message, on plugin inclusion | Выводим сообщение, о включении плагина

        );
        logger.info(

                PLUGIN_NAME_COLORED + PLUGIN_TEST_COLORS_PREFIX + SPACE + COL_BLACK + "Black" + COMMA_RES + COL_GREY + "Gray" + COMMA_RES + COL_RED + "Red" + COMMA_RES + COL_RED_LIGHT + "Light Red" + COMMA_RES + COL_GREEN + "Green" + COMMA_RES + COL_GREEN_LIGHT + "Light Green" + COMMA_RES + COL_YELLOW + "Yellow" + COMMA_RES + COL_YELLOW_LIGHT + "Light Yellow" + COMMA_RES + COL_BLUE + "Blue" + COMMA_RES + COL_BLUE_LIGHT + "Light Blue" + COMMA_RES + COL_PURPLE + "Purple" + COMMA_RES + COL_PURPLE_LIGHT + "Light Purple" + COMMA_RES + COL_CYAN + "Cyan" + COMMA_RES + COL_CYAN_LIGHT + "Light Cyan" + COMMA_RES + COL_WHITE + "White" + COL_RESET + "." //Display the list of colors | Выводим список цветов
        );
    }

    @Override
    public void onLoad() { //Still in development | Ещё в разработке
        super.onLoad();
    }

    @Override
    public void onDisable(){ //The feature is triggered when the server shuts down or plugin. You can implement saving the configuration, etc. | Функция срабатывает когда сервер или плагин выключается. Можно внедрить сохранение конфигурации и т.д.
        //logger.info(COL_CYAN + "Plugin set OFF!");
        logger.info(
                String.format("%s[%sHello%sWorld%s] %sPlugin set OFF!%s", COL_GREY, COL_CYAN, COL_BLUE, COL_GREY, COL_RED, COL_RESET) //Displaying a message about shutting down plugin | Выводим сообщение, о выключении плагина
        );
    }
}
