package com.ritwik.customlistview;

class Custom {
    private int img;
    private String name,team;

    public Custom(int img, String name, String team) {
        this.img = img;
        this.name = name;
        this.team = team;
    }

    int getImg() {
        return img;
    }

    String getName() {
        return name;
    }

    String getTeam() {
        return team;
    }

}
