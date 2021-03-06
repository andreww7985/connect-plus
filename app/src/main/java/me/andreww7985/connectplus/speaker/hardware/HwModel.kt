package me.andreww7985.connectplus.speaker.hardware

enum class HwModel(val value: Int, val modelName: String) {
    FLIP3(0x0023, "flip3"),
    XTREME(0x0024, "xtreme"),
    PULSE2(0x0026, "pulse2"),

    CHARGE3(0x1EBC, "charge3"),
    FLIP4(0x1ED1, "flip4"),
    PULSE3(0x1ED2, "pulse3"),
    BOOMBOX(0x1EE7, "boombox"),
    XTREME2(0x1EFC, "xtreme2"),

    CHARGE4(0x1F17, "charge4"),

    FLIP5(0x1F31, "flip5"),
    BOOMBOX2(0x1F53, "boombox2"),
    PULSE4(0x1F56, "pulse4"),

    XTREME3(0x202F, "xtreme3"),
    CHARGE5(0x2040, "charge5"),

    UNKNOWN(0xFFFF, "unknown");

    companion object {
        fun from(modelId: Int) = when (modelId) {
            0x0023 /* CSR */ -> FLIP3
            0x0024 /* CSR */ -> XTREME
            0x0026 /* CSR */ -> PULSE2
            0x1EBC /* CSR */, 0x1F25 /* QCC */ -> CHARGE3
            0x1ED1 /* CSR */, 0x1F24 /* QCC */ -> FLIP4
            0x1ED2 /* CSR */, 0x1F28 /* QCC */ -> PULSE3
            0x1EE7 /* CSR */, 0x1F27 /* QCC */ -> BOOMBOX
            0x1EFC /* CSR */, 0x1F26 /* QCC */, 0x2038 /* QCC */ -> XTREME2
            0x1F17 /* CSR */, 0x1F29 /* QCC */ -> CHARGE4
            0x1F31 /* VIMICRO */ -> FLIP5
            0x1F53 /* VIMICRO */ -> BOOMBOX2
            0x1F56 /* VIMICRO */ -> PULSE4
            0x202F /* VIMICRO */ -> XTREME3
            0x2040 /* VIMICRO */ -> CHARGE5
            else -> UNKNOWN
        }
    }
}