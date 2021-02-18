package response

object ScreenApiErrorCodes {

    const val SCREEN_RESPONSE_OK = 0
    const val SCREEN_RESPONSE_ERROR_INCORRECT_PARAMS = 101
    const val SCREEN_RESPONSE_ERROR_INVALID_SESSION = 102
    const val SCREEN_RESPONSE_ERROR_SCREEN_FILTER_NOT_FOUND = 103
    const val SCREEN_RESPONSE_ERROR_SCREEN_FILTER_CREATION_FAILED = 104
    const val SCREEN_RESPONSE_ERROR_METHOD_NOT_ALLOWED = 105
    const val SCREEN_RESPONSE_ERROR_ELEMENT_NOT_ALLOWED = 106
    const val SCREEN_RESPONSE_ERROR_INVALID_PIN_OR_TOKEN = 107
    const val SCREEN_RESPONSE_ERROR_USER_NOT_FOUND = 108
    const val SCREEN_RESPONSE_ERROR_INVALID_PHONE_CONFIRMATION_CODE = 109
    const val SCREEN_RESPONSE_ERROR_EXPIRED_PHONE_CONFIRMATION_CODE = 127
    const val SCREEN_RESPONSE_ERROR_DEVICE_LIMIT_EXCEEDED = 110
    const val SCREEN_RESPONSE_ERROR_INVALID_SIGNATURE = 111
    const val SCREEN_RESPONSE_ERROR_PENDING_AUTHENTICATION = 112
    const val SCREEN_RESPONSE_ERROR_AUTHENTICATION_ERROR = 113
    const val SCREEN_RESPONSE_ERROR_MERGE_ERROR = 114
    const val SCREEN_RESPONSE_ERROR_MERGE_WITH_SUBSCRIPTIONS_NOT_SUPPORTED = 115
    const val SCREEN_RESPONSE_ERROR_MERGE_SAME_ACCOUNT = 116
    const val SCREEN_RESPONSE_ERROR_EMAIL_EXISTS = 117
    const val SCREEN_RESPONSE_ERROR_PHONE_EXISTS = 118
    const val SCREEN_RESPONSE_ERROR_DEVICE_BLOCKED = 119
    const val SCREEN_RESPONSE_ERROR_PHONE_BLOCKED = 128
    const val SCREEN_RESPONSE_ERROR_ELEMENT_ALREADY_PURCHASED = 201
    const val SCREEN_RESPONSE_ERROR_NOT_ENOUGH_MONEY = 202
    const val SCREEN_RESPONSE_ERROR_ELEMENT_NOT_IN_SUBSCRIPTION = 203
    const val SCREEN_RESPONSE_ERROR_ELEMENT_ALREADY_BOOKMARKED = 204
    const val SCREEN_RESPONSE_ERROR_ELEMENT_NOT_FOUND = 205
    const val SCREEN_RESPONSE_ERROR_NO_LINKED_CARD = 206
    const val SCREEN_RESPONSE_ERROR_MORE_THAN_ONE_LINKED_CARD = 207
    const val SCREEN_RESPONSE_ERROR_INCORRECT_PRICE_OR_OFFER = 208
    const val SCREEN_RESPONSE_EXTERNAL_CARD_REBILL_ERROR = 209
    const val SCREEN_RESPONSE_ERROR_INSUFFICIENT_FUNDS = 213
    const val SCREEN_RESPONSE_ERROR_REJECTED_BY_PROCESSING = 214
    const val SCREEN_RESPONSE_ERROR_PROCESSING_FRAUD_CHECK_ERROR = 215
    const val SCREEN_RESPONSE_ERROR_INVALID_PHONE_NUMBER = 216
    const val SCREEN_RESPONSE_ERROR_CUSTOMER_WAIT_TIMEOUT = 217
    const val SCREEN_RESPONSE_ERROR_PROCESSING_DOES_NOT_RESPOND = 218
    const val SCREEN_RESPONSE_ERROR_REJECTED_BY_CLIENT = 219
    const val SCREEN_RESPONSE_ERROR_GENERAL_PAYMENT_REQUEST_ERROR = 220
    const val SCREEN_RESPONSE_ERROR_GENERAL_PAYMENT_ADAPTER_ERROR = 221
    const val SCREEN_RESPONSE_ERROR_QIWI_WALLET_TOKEN_NOT_FOUND = 222
    const val SCREEN_RESPONSE_ERROR_QIWI_AUTHORIZATION_ERROR = 223
    const val SCREEN_RESPONSE_ERROR_QIWI_PROCESSING_TEMPORARILY_UNAVAILABLE = 224
    const val SCREEN_RESPONSE_ERROR_QIWI_UNIDENTIFIED_USER = 225
    const val SCREEN_RESPONSE_ERROR_QIWI_UNKNOWN_CELL_OPERATOR = 226
    const val SCREEN_RESPONSE_ERROR_OFFLINE_RESTRICTED = 228
    const val SCREEN_RESPONSE_ERROR_INCORRECT_OFFER_CODE = 301
    const val SCREEN_RESPONSE_ERROR_PROMO_CODE_BLOCKED = 302
    const val SCREEN_RESPONSE_ERROR_OFFER_NOT_AVAILABLE = 303
    const val SCREEN_RESPONSE_ERROR_OFFER_NOT_AVAILABLE_TEMPORARILY = 304
    const val SCREEN_RESPONSE_ERROR_OFFER_WAS_USED = 305
    const val SCREEN_RESPONSE_ERROR_PROMO_CODE_ACTIVATION_FAILED = 306
    const val SCREEN_RESPONSE_ERROR_NO_APPLICABLE_OFFERS = 307
    const val SCREEN_RESPONSE_ERROR_SUBSCRIPTION_BY_OFFER_LIMIT_EXCEEDED = 308
    const val SCREEN_RESPONSE_ERROR_MUTUALLY_EXCLUSIVE_ACTIVE_SUBSCRIPTION = 309
    const val SCREEN_RESPONSE_ERROR_PROMO_CODE_EXPIRED = 310
    const val SCREEN_RESPONSE_ERROR_SECURE_ID_VALIDATION_FAILED = 401
    const val SCREEN_RESPONSE_ERROR_IP_BLACK_LIST = 501
    const val SCREEN_RESPONSE_ERROR_IP_GEO_LOCATION_RESTRICTED = 502
    const val SCREEN_RESPONSE_ERROR_SPORT_PHONE_NOT_CONFIRMED = 901
    const val SCREEN_RESPONSE_ERROR_SPORT_PHONE_NOT_VALID = 902
    const val SCREEN_RESPONSE_ERROR_SPORT_INVALID_REGION = 903
    const val SCREEN_RESPONSE_ERROR_SPORT_NOT_ACTIVATED = 904
    const val SCREEN_RESPONSE_ERROR_SPORT_UNEXPECTED_EXCEPTION = 999
    const val SCREEN_RESPONSE_ERROR_SERVICE_ERROR = 9999

    // playback
    const val SCREEN_RESPONSE_PLAYBACK_NOT_ALLOWED_FOR_REGION = 403
    const val SCREEN_RESPONSE_PLAYBACK_FILE_REQUEST_ERROR = 404
    const val SCREEN_RESPONSE_NO_ACTIVE_MEDIA_SLOT_FOR_TRANSACTION_ID = 512
    const val SCREEN_RESPONSE_LICENSE_EXPIRED = 513
    const val SCREEN_RESPONSE_LICENSE_COUNT_EXCEEDED = 514
    const val SCREEN_RESPONSE_FAILED_TO_DETECT_CLIENT_REGION_BY_GEO_IP = 769

}
