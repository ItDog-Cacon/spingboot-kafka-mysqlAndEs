package com.byzoro.yjzhdatastorage.entity;


public enum IntfId {
    BsNodeStatusTopic("51"),
    BsForceResolveTopic("52"),
    BsCacheTopic("53"),
    BsIterationtTopic("54"),
    BsInitiativeNodeTopic("55"),
    BsPassiveNodeTopic("56"),
    BsInformationExtractTopic("57"),
    BsMultiCollectNodeTopic("58"),
    BsDatabaseNodeTopic("59"),
    BsEmergencyNodeTopic("60"),
    BsWaringBusinessTopic("61"),
    BsUserTopic("62"),
    BsRecursiveDrTopic("63"),
    BsIterationDrTopic("64");
    String topic;
    IntfId(String idx) {
        this.topic = idx;
    }

    public static IntfId fromTypeName(String topic) {
        for (IntfId type : IntfId.values()) {
            if (type.getTypeName().equals(topic)) {
                return type;
            }
        }
        return null;
    }

    public String getTypeName() {
        return this.topic;
    }
}
