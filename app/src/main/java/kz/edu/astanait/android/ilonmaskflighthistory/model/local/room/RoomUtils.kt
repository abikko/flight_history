package kz.edu.astanait.android.ilonmaskflighthistory.model.local.room

object RoomUtils {
    const val FLIGHT_HISTORY_TABLE_KEY = "flight_history"
    const val FLIGHT_HISTORY_COLUMN_DETAILS = "details"
    const val FLIGHT_HISTORY_COLUMN_CREW = "crew"
    const val FLIGHT_HISTORY_COLUMN_FLIGHT_NUMBER = "flight_number"
    const val FLIGHT_HISTORY_COLUMN_IS_TENTATIVE = "is_tentative"
    const val FLIGHT_HISTORY_COLUMN_LAUNCH_DATE_LOCAL = "launch_date_local"
    const val FLIGHT_HISTORY_COLUMN_LAUNCH_DATE_UNIX = "launch_date_unix"
    const val FLIGHT_HISTORY_COLUMN_LAUNCH_DATE_UTC = "launch_date_utc"
    const val FLIGHT_HISTORY_COLUMN_LAUNCH_SITE = "launch_site"
    const val FLIGHT_HISTORY_COLUMN_LAUNCH_WINDOW = "launch_window"
    const val FLIGHT_HISTORY_COLUMN_LAUNCH_YEAR = "launch_year"
    const val FLIGHT_HISTORY_COLUMN_LAUNCH_FAILURE_DETAILS = "launch_failure_details"
    const val FLIGHT_HISTORY_COLUMN_LINKS = "links"
    const val FLIGHT_HISTORY_COLUMN_MISSION_ID = "mission_id"
    const val FLIGHT_HISTORY_COLUMN_MISSION_NAME = "mission_name"
    const val FLIGHT_HISTORY_COLUMN_ROCKET = "rocket"
    const val FLIGHT_HISTORY_COLUMN_SHIPS = "ships"
    const val FLIGHT_HISTORY_COLUMN_STATIC_FIREDATE_UNIX = "static_firedate_unix"
    const val FLIGHT_HISTORY_COLUMN_STATIC_FIREDATE_UTC = "static_firedate_utc"
    const val FLIGHT_HISTORY_COLUMN_TBD = "tbd"
    const val FLIGHT_HISTORY_COLUMN_TELEMETRY = "telemetry"
    const val FLIGHT_HISTORY_COLUMN_TENTATIVE_MAX_PRECISION = "tentative_max_precision"
    const val FLIGHT_HISTORY_COLUMN_TIMELINE = "timeline"
    const val FLIGHT_HISTORY_COLUMN_UPCOMING = "upcoming"
    const val FLIGHT_HISTORY_COLUMN_LAUNCH_SUCCESS = "launch_success"


    const val LAUNCH_FAILURE_DETAILS_TABLE_KEY = FLIGHT_HISTORY_COLUMN_LAUNCH_FAILURE_DETAILS
    const val LAUNCH_FAILURE_COLUMN_ALTITUDE = "altitude"
    const val LAUNCH_FAILURE_COLUMN_REASON = "reason"
    const val LAUNCH_FAILURE_COLUMN_TIME = "time"


    const val ROCKET_TABLE_KEY = FLIGHT_HISTORY_COLUMN_ROCKET
    const val ROCKET_COLUMN_FAIRINGS = "fairings"
    const val ROCKET_COLUMN_FIRST_STAGE = "first_stage"
    const val ROCKET_COLUMN_ROCKET_ID = "rocket_id"
    const val ROCKET_COLUMN_ROCKET_NAME = "rocket_name"
    const val ROCKET_COLUMN_ROCKET_TYPE = "rocket_type"
    const val ROCKET_COLUMN_SECOND_STAGE = "second_stage"


    const val TELEMETRY_TABLE_KEY = FLIGHT_HISTORY_COLUMN_TELEMETRY
    const val TELEMETRY_COLUMN_FLIGHT_CLUB = "flight_club"

    const val TIMELINE_TABLE_KEY = FLIGHT_HISTORY_COLUMN_TIMELINE
    const val TIMELINE_COLUMN_WEBCAST_LIFT_OFF ="webcast_liftoff"
}