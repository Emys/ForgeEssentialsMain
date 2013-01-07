package com.ForgeEssentials.coremod;

/**
 * Kindly do not reference any FE classes outside the coremod package in this class. This is a store room for all String[]s used by the coremod, 99% of stuff is
 * edited here and not in the actual coremod classes.
 */

public class Data
{

	public static String[] libraries = { "mysql-connector-java-bin.jar", "sqlite-jdbc.jar" };
	public static String[] checksums = { "3ae0cff91d7f40d5b4c7cefbbd1eab34025bdc15", "52314f3ac527c643444f529fe9ee00c25aa16d91" };
	protected static String[] transformers = { "com.ForgeEssentials.coremod.transformers.FEPermissionsTransformer",
			"com.ForgeEssentials.coremod.transformers.FEAccessTransformer", "com.ForgeEssentials.coremod.transformers.FEeventAdder" };
	protected static String[] downloaders = { "com.ForgeEssentials.coremod.libget.SQLDownloader", "com.ForgeEssentials.coremod.libget.WEDownloader" };
}
