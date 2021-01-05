/** 
* 
*/
package com.MAVLink.enums;

public class CAMERA_STATUS_TYPES {
	public static final int CAMERA_STATUS_TYPE_HEARTBEAT = 0; /* Camera heartbeat, announce camera component ID at 1hz | */
	public static final int CAMERA_STATUS_TYPE_TRIGGER = 1; /* Camera image triggered | */
	public static final int CAMERA_STATUS_TYPE_DISCONNECT = 2; /* Camera connection lost | */
	public static final int CAMERA_STATUS_TYPE_ERROR = 3; /* Camera unknown error | */
	public static final int CAMERA_STATUS_TYPE_LOWBATT = 4; /* Camera battery low. Parameter p1 shows reported voltage | */
	public static final int CAMERA_STATUS_TYPE_LOWSTORE = 5; /* Camera storage low. Parameter p1 shows reported shots remaining | */
	public static final int CAMERA_STATUS_TYPE_LOWSTOREV = 6; /* Camera storage low. Parameter p1 shows reported video minutes remaining | */
	public static final int CAMERA_STATUS_TYPES_ENUM_END = 7; /*  | */
}
            