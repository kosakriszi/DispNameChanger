package me.captain.dnc;

/**
 * An Enumeration of Strings that the plugin uses that are visible to the
 * user. Some Enumerations have arguments listed in JD header.
 *
 * @author Mark 'SniperFodder' Gunnett
 */
public enum DNCStrings {

    /*
	 * Error Strings
	 */
    /**
     * For too many arguments.
     */
    ERROR_BAD_ARGS,

    /**
     * For when Argument Type does not match needed type.
     */
    ERROR_BAD_INPUT,

    /**
     * For when user does not exist or is not online.
     */
    ERROR_BAD_USER,

    /**
     * For when trying to rename the console.
     */
    ERROR_CONSOLE_RENAME,

    /**
     * For when multiple people match a target.
     */
    ERROR_MULTI_MATCH,

    /**
     * For when a user is trying to reset their own name and it is already at default.
     */
    ERROR_NAME_RESET,

    /**
     * For when a name is non-unique.
     */
    ERROR_NON_UNIQUE,
	
	/*
	 * Info Strings
	 */
    /**
     * Statement about more than 1 user match.
     */
    INFO_CHECK_MULTI,

    /**
     * Actual X is Y string for multi-match.
     */
    INFO_CHECK_MULTI_LIST,

    /**
     * {0} is really {1}.<br>
     * <br>
     * <p>
     * Argument {0}: Queried name<br>
     * Argument {1}: Actual name<br>
     */
    INFO_CHECK_SINGLE,

    /**
     * Statement about creating database.
     */
    INFO_DB_MAKE,

    /**
     * Statement about loaded commands.
     */
    INFO_DNC_COMMANDS,

    /**
     * Statement about disabling DNC.
     */
    INFO_DNC_DISABLED,

    /**
     * Statement about enabling DNC.
     */
    INFO_DNC_ENABLED,

    /**
     * List of users - Page [{0}/{1}] - Type /{2} {3} for more.<br>
     * <p>
     * Argument {0}: Current page<br>
     * Argument {1}: Max Pages<br>
     * Argument {2}: Command to Type for list<br>
     * Argument {3}: Next page<br>
     */
    INFO_LIST,

    /**
     * List of users - Page[{0}/{1}]<br>
     * <br>
     * <p>
     * Argument {0}: Current page<br>
     * Argument {1}: Max pages<br>
     */
    INFO_LIST_MAX,

    /**
     * Statement to caller about name change.
     */
    INFO_NICK_CALLER,

    /**
     * Name was reset because non-unique.
     */
    INFO_NICK_CONFLICT,

    /**
     * Statement to target about name change.
     */
    INFO_NICK_TARGET,

    /**
     * No TagAPI Found Statement.
     */
    INFO_NO_TAGAPI,

    /**
     * Called if saving completely disabled by config options.
     */
    INFO_SAVE_DISABLED,

    /**
     * Server Log stating Tag modified by another plugin, no changed
     * commited.
     */
    INFO_TAG_MODIFIED,

    /**
     * TagAPI Found statement
     */
    INFO_TAGAPI,

    /**
     * TagAPI and SpoutAPI Load conflict message.
     */
    INFO_TAGAPI_CONFLICT,
	
	/*
	 * Permission errors.
	 */
    /**
     * Error about checking names.
     */
    PERMISSION_CHECK,

    /**
     * Error about using illegal color in name.
     * <p>
     * Argument {0}: Color name
     */
    PERMISSION_COLOR,

    /**
     * Error about listing display names.
     */
    PERMISSION_LIST,

    /**
     * Error about changing other player's names.
     */
    PERMISSION_OTHER,

    /**
     * Error about using spaces in names.
     */
    PERMISSION_SPACES,

    /**
     * Error about using illegal style in name.
     * <p>
     * Argument {0}: Style Name
     */
    PERMISSION_STYLE,

    /**
     * Error about changing names.
     */
    PERMISSION_USE;

    /**
     * Long version of the Plugin Name. <code>[DispNameChanger]</code>
     */
    public static final String dnc_long = "[DispNameChanger] ";

    /**
     * Short version of the plugin name. <code>[DNC]</code>
     */
    public static final String dnc_short = "[DNC] ";
}
