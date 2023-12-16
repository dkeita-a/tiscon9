package com.tiscon.code;

/**
 * オプションサービスのコード
 *
 * @author Oikawa Yumi
 */
public enum OptionalServiceType implements CodeEnum {

    /** 洗濯機取り付け */
    WASHING_MACHINE(1, "洗濯機取り付け"),

    /*北海道を始点、終点とした引っ越し */
    HOKKAIDO(2, "北海道");

    /** オプションサービスのラベル */
    private final String label;
    /** オプションサービスのラベルのコード */
    private final int code;

    /**
     * コンストラクタ。
     *
     * @param code  コード値
     * @param label ラベル
     */
    OptionalServiceType(int code, String label) {
        this.label = label;
        this.code = code;
    }

    @Override
    public String getLabel() {
        return label;
    }

    @Override
    public int getCode() {
        return code;
    }
}
