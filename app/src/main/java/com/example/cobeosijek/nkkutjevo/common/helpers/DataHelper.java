package com.example.cobeosijek.nkkutjevo.common.helpers;

import com.example.cobeosijek.nkkutjevo.data_objects.ImageModel;
import com.example.cobeosijek.nkkutjevo.data_objects.PlayerModel;
import com.example.cobeosijek.nkkutjevo.data_objects.TeamModel;

import java.util.ArrayList;
import java.util.List;

public class DataHelper {

    //Gallery

    public static List<ImageModel> loadImages() {
        List<ImageModel> imageModelList = new ArrayList<>();

        imageModelList.add(new ImageModel("https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/18893381_1484880998199535_3926016716721806301_n.jpg?oh=713be7150f9c6251cf8119c1feca949d&oe=59FA6F2B"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/13344784_1208951652457483_8379010329349936114_n.jpg?oh=d1452f37590cddfd256b2999b100752b&oe=5A09BAD9"));
        imageModelList.add(new ImageModel("https://scontent-frx5-1.xx.fbcdn.net/v/t31.0-8/14258269_652930878195303_5274084096274754738_o.jpg?oh=38a7542b707a6063d40b363dc3c74a73&oe=59FC6D2C"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/13092015_1191273044230694_1888391076572090382_n.jpg?oh=75fdbeed9760b5bf71690a55e14acfe5&oe=59EA92FB"));
        imageModelList.add(new ImageModel("https://scontent-frx5-1.xx.fbcdn.net/v/t31.0-8/13411757_611859862302405_4256957222027931663_o.jpg?oh=eeee26d1706f84329f605e71c72fcb34&oe=5A048AC3"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/10418392_854695394658245_4298681668277809804_n.jpg?oh=fd45d42b8e6f10508b1900956aa9e0f5&oe=5A02ED66"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.ffbcdn.net/v/t1.0-9/12814207_854695214658263_8384728866098034082_n.jpg?oh=57b997e351f45cd1996f4d96b2dbfc06&oe=59F21C36"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/1914296_854695077991610_2938904400271113393_n.jpg?oh=a53f17cb46fd0e1866bdc1dfe889ae9a&oe=59F1039E"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/12795319_854695007991617_1340873407996553200_n.jpg?oh=4cc5b973add45e5462f071b996825d8b&oe=5A00EA88"));
        imageModelList.add(new ImageModel("https://scontent-frx5-1.xx.fbcdn.net/v/t31.0-8/13131294_597094260445632_4003245973287449478_o.jpg?oh=235c0c8d9678a9f52b204a548ce5feb0&oe=59EFA8C5"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/12804754_854694911324960_3507056822377608167_n.jpg?oh=367697c4b347a89cf92c23fcab27496a&oe=5A392B94"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/12814189_854694881324963_7249503698973388111_n.jpg?oh=177fe46dcd913926b4622c200d8d1ef3&oe=5A33F6B7"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/12806098_900362630082664_1389783148165164791_n.jpg?oh=8a0db52ee3e198d214415ca987a916ef&oe=5A098792"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/12799260_978953242183525_5929870416086384240_n.jpg?oh=697f2fe374a306041208d91ef435bbaa&oe=5A028806"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/12814115_978953222183527_4744980310691285523_n.jpg?oh=c5aa75db27e972e1b80b3bcb74a8d91d&oe=5A36DB7D"));
        imageModelList.add(new ImageModel("https://scontent-frx5-1.xx.fbcdn.net/v/t31.0-8/12968036_582393338582391_1069860027685790628_o.jpg?oh=b52739f0289ad9f993e2c5b9610f1888&oe=5A029197"));
        imageModelList.add(new ImageModel("https://scontent-frx5-1.xx.fbcdn.net/v/t31.0-8/13048087_591424494345942_4133454328851587322_o.jpg?oh=9c50c6689c0256a0cf16837b86a3f857&oe=5A033CBF"));
        imageModelList.add(new ImageModel("https://scontent-frx5-1.xx.fbcdn.net/v/t31.0-8/13041279_591424667679258_4901043876407164036_o.jpg?oh=f48045e290c05aa45479b48eaca06076&oe=59EB5CF4"));
        imageModelList.add(new ImageModel("https://scontent-frx5-1.xx.fbcdn.net/v/t31.0-8/13063145_591424964345895_1133966228479383977_o.jpg?oh=cbffd99499dde36d223360d67f3607a8&oe=5A055919"));
        imageModelList.add(new ImageModel("https://scontent-frx5-1.xx.fbcdn.net/v/t31.0-8/13072760_591424847679240_2111302485332944176_o.jpg?oh=39fc46c512898e54c205021983af9e82&oe=59FDCE09"));
        imageModelList.add(new ImageModel("https://scontent-frx5-1.xx.fbcdn.net/v/t31.0-8/13062945_591424981012560_441708106600923635_o.jpg?oh=ed2b6f43a48cd064f4fb561cd1a1108e&oe=5A339BEF"));
        imageModelList.add(new ImageModel("https://scontent-frx5-1.xx.fbcdn.net/v/t31.0-8/13040901_591425227679202_5391073733585903350_o.jpg?oh=4773670863ceb1ebd208cc7ac0551f38&oe=59FCE4F1"));

        return imageModelList;
    }


    //Team ranking
    public static List<TeamModel> getteamModelList() {
        List<TeamModel> teamModels = new ArrayList<>();

        teamModels.add(new TeamModel("Kutjevo", 0, 0, 0, 0, 0, 0));
        teamModels.add(new TeamModel("Pozega", 0, 0, 0, 0, 0, 0));
        teamModels.add(new TeamModel("Buk", 0, 0, 0, 0, 0, 0));
        teamModels.add(new TeamModel("Kaptol", 0, 0, 0, 0, 0, 0));
        teamModels.add(new TeamModel("Jaksic", 0, 0, 0, 0, 0, 0));
        teamModels.add(new TeamModel("Mihaljevci", 0, 0, 0, 0, 0, 0));
        teamModels.add(new TeamModel("Kuzmica", 0, 0, 0, 0, 0, 0));
        teamModels.add(new TeamModel("Papuk", 0, 0, 0, 0, 0, 0));
        teamModels.add(new TeamModel("Pavlovci", 0, 0, 0, 0, 0, 0));
        teamModels.add(new TeamModel("Gradac", 0, 0, 0, 0, 0, 0));
        teamModels.add(new TeamModel("Vidovci", 0, 0, 0, 0, 0, 0));
        teamModels.add(new TeamModel("Lipik", 0, 0, 0, 0, 0, 0));

        return teamModels;
    }

    //List of players
    public static List<PlayerModel> getPlayerModelList() {
        List<PlayerModel> playerModels = new ArrayList<>();

        playerModels.add(new PlayerModel(1, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(2, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(3, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(4, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(5, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(6, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(7, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(8, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(9, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(10, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(11, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(12, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(13, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(14, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));
        playerModels.add(new PlayerModel(15, "Luka", "Kordic", 22, "CMF", "http://icons.veryicon.com/128/Avatar/People/Footballer.png", 22, 1800, 5, 4, 0));

        return playerModels;
    }
}
