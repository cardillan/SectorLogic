package cardillan.sectors.logic;

import arc.graphics.Color;
import mindustry.gen.Icon;
import mindustry.logic.LCategory;

public class SectorLogic {
    public static LCategory launchCategory;

    public static void init(){
        launchCategory = new LCategory("sectorlogic", new Color(0x806b00ff), Icon.planetSmall);
        LogicStatements.register();
    }
}
