package io.github.addonmod;

public class Reference {

    // Mod info
	public static final String MOD_NAME = "Addon Template";
    public static final String MOD_ID = "addon-template";
    public static final String MOD_VERSION = "1.0.0";
    public static final String MOD_CHANNEL = MOD_ID;
    public static final String MOD_MC_VERSION_RANGE = "[1.12,1.13)";

    // Paths
    public static final String TEXTURE_PATH_GUI = "textures/gui/";
    public static final String TEXTURE_PATH_SKINS = "textures/skins/";
    public static final String TEXTURE_PATH_MODELS = "textures/models/";
    public static final String TEXTURE_PATH_ENTITIES = "textures/entities/";
    public static final String TEXTURE_PATH_GUIBACKGROUNDS = "textures/gui/title/background/";
    public static final String TEXTURE_PATH_ITEMS = "textures/items/";
    public static final String TEXTURE_PATH_PARTICLES = "textures/particles/";
    public static final String MODEL_PATH = "models/";

    // MOD ID's
    public static final String MOD_FORGE = "forge";
    public static final String MOD_FORGE_VERSION_MIN = "14.23.5.2847";

    public static final String MOD_GALACTICRAFT = "galacticraftcore";

    public static final String FORGE_DEPENDENCY = "required-after:" + MOD_FORGE + "@[" + MOD_FORGE_VERSION_MIN + ",); ";
    public static final String GC_DEPENDENCY = "required-after:" + MOD_GALACTICRAFT + "; ";

    // Dependencies
    public static final String MOD_DEPENDENCIES = FORGE_DEPENDENCY + GC_DEPENDENCY;
}
