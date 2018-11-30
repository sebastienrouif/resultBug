package com.sebastienrouif.resultbug


fun Int.toActivityResult() = when (this) {
    0 -> "RESULT_CANCELED"
    -1 -> "RESULT_OK"
    1 -> "RESULT_FIRST_USER"
    else -> "unknown"
}