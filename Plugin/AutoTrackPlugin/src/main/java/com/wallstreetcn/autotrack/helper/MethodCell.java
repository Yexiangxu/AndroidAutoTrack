package com.wallstreetcn.autotrack.helper;

public class MethodCell {
    public String name;
    public String desc;
    public String parent;
    public String agentName;
    public String agentDesc;
    public int paramsStart;
    public int paramsCount;

    public int[] opcodes;

    public MethodCell(String name, String desc, String parent, String agentName, String agentDesc, int paramsStart,
                      int paramsCount, int[] opcodes) {
        this.name = name;
        this.desc = desc;
        this.parent = parent;
        this.agentName = agentName;
        this.agentDesc = agentDesc;
        this.paramsStart = paramsStart;
        this.paramsCount = paramsCount;
        this.opcodes = opcodes;
    }
}
