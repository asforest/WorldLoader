package cn.innc11.WorldAutoLoader;

import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;

import java.io.File;

public class Main extends PluginBase
{
    @Override
    public void onEnable() {
        File worldsFolder = new File("worlds/");
        for(File wFolder : worldsFolder.listFiles())
        {
            if(wFolder.isDirectory())
            {
                if(!getServer().isLevelLoaded(wFolder.getName()))
                {
                    getServer().loadLevel(wFolder.getName());
                    getLogger().info("Auto loading world: "+ TextFormat.GREEN + wFolder.getName());
                }
            }
        }
    }
}
