package cardillan.sectors;

import cardillan.sectors.logic.SectorLogic;
import mindustry.mod.Mod;

public class Main extends Mod {

    @Override
    public void init(){
        super.init();

        SectorLogic.init();
    }
}
