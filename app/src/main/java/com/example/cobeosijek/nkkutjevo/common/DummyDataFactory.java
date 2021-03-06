package com.example.cobeosijek.nkkutjevo.common;

import android.widget.ImageView;

import com.example.cobeosijek.nkkutjevo.common.utils.ImageUtils;
import com.example.cobeosijek.nkkutjevo.data_objects.ImageModel;
import com.example.cobeosijek.nkkutjevo.data_objects.TeamModel;
import com.example.cobeosijek.nkkutjevo.data_objects.player_model.PlayerAbilities;
import com.example.cobeosijek.nkkutjevo.data_objects.player_model.PlayerModel;
import com.example.cobeosijek.nkkutjevo.data_objects.player_model.PlayerStats;

import java.util.ArrayList;
import java.util.List;

public class DummyDataFactory {

    public static List<ImageModel> loadImages() {
        List<ImageModel> imageModelList = new ArrayList<>();

        imageModelList.add(new ImageModel("https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/18893381_1484880998199535_3926016716721806301_n.jpg?oh=713be7150f9c6251cf8119c1feca949d&oe=59FA6F2B"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/13344784_1208951652457483_8379010329349936114_n.jpg?oh=d1452f37590cddfd256b2999b100752b&oe=5A09BAD9"));
        imageModelList.add(new ImageModel("https://scontent-frx5-1.xx.fbcdn.net/v/t31.0-8/14258269_652930878195303_5274084096274754738_o.jpg?oh=38a7542b707a6063d40b363dc3c74a73&oe=59FC6D2C"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/13092015_1191273044230694_1888391076572090382_n.jpg?oh=75fdbeed9760b5bf71690a55e14acfe5&oe=59EA92FB"));
        imageModelList.add(new ImageModel("https://scontent-frx5-1.xx.fbcdn.net/v/t31.0-8/13411757_611859862302405_4256957222027931663_o.jpg?oh=eeee26d1706f84329f605e71c72fcb34&oe=5A048AC3"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/10418392_854695394658245_4298681668277809804_n.jpg?oh=fd45d42b8e6f10508b1900956aa9e0f5&oe=5A02ED66"));
        imageModelList.add(new ImageModel("https://scontent-frt3-1.xx.fbcdn.net/v/t1.0-9/1914296_854695077991610_2938904400271113393_n.jpg?oh=a53f17cb46fd0e1866bdc1dfe889ae9a&oe=59F1039E"));
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

    public static List<PlayerModel> getPlayerModelList() {
        List<PlayerModel> playerModels = new ArrayList<>();

        playerModels.add(new PlayerModel(1, "Ivan", "Majetic", 25, "GK", "https://scontent-frx5-1.xx.fbcdn.net/v/t1.0-9/12644719_10205159783666396_3660980232995665197_n.jpg?oh=ec83aae41766730a8014030b96430527&oe=5A2F7467", 1, new PlayerAbilities(20, 17, 13, 5, 5, 8, 18, 16), new PlayerStats(6, 200, 0, 0, 0)));
        playerModels.add(new PlayerModel(2, "Stjepan", "Vasic", 22, "SS", "https://scontent-frx5-1.xx.fbcdn.net/v/t1.0-9/10374914_797042676995258_2733652903543835564_n.jpg?oh=45adec1362809f771c66786022033820&oe=5A2E6BFA", 2, new PlayerAbilities(12, 17, 16, 10, 15, 12, 16, 10), new PlayerStats(15, 814, 4, 0, 0)));
        playerModels.add(new PlayerModel(3, "Stipo", "Jelusic", 28, "LWB/RWB", "https://scontent-frx5-1.xx.fbcdn.net/v/t1.0-9/10734160_890273454330656_1767118847469978713_n.jpg?oh=62224013418185a85787bdb2abe9d93b&oe=5A390EDE", 3, new PlayerAbilities(18, 17, 17, 5, 5, 10, 16, 17), new PlayerStats(14, 681, 0, 3, 0)));
        playerModels.add(new PlayerModel(4, "Zlatko", "Hora", 32, "CB", "https://scontent-frx5-1.xx.fbcdn.net/v/t1.0-9/12717363_1229295863765221_5049203837308819321_n.jpg?oh=85a7f1f187575faff679961f226b983e&oe=59FA9E3D", 4, new PlayerAbilities(19, 20, 17, 10, 9, 11, 20, 16), new PlayerStats(17, 1338, 0, 3, 1)));
        playerModels.add(new PlayerModel(5, "Ivan", "Franjic", 23, "DMF/CMF", "https://scontent-frx5-1.xx.fbcdn.net/v/t1.0-9/10986503_10203009809441147_7557408399289319992_n.jpg?oh=63e6d09dabaf9fe37c6127ed2fed3305&oe=59F458C9", 6, new PlayerAbilities(12, 18, 15, 19, 17, 20, 18, 18), new PlayerStats(9, 793, 0, 5, 0)));
        playerModels.add(new PlayerModel(6, "Josip", "Budimir", 29, "SS/AML", "https://scontent-frx5-1.xx.fbcdn.net/v/t31.0-8/12967415_582403691914689_179886055394567351_o.jpg?oh=46bd599ca40b8628b665ec6f5e165bf5&oe=59F5F79E", 7, new PlayerAbilities(8, 18, 18, 20, 18, 20, 10, 19), new PlayerStats(18, 1547, 18, 1, 0)));
        playerModels.add(new PlayerModel(7, "Luka", "Kordic", 22, "CMF/AMF", "https://scontent-frx5-1.xx.fbcdn.net/v/t1.0-9/10858457_10204626002843388_9122226864758380241_n.jpg?oh=77597aa631dbaf174521cb7d4452bda3&oe=59F817D9", 8, new PlayerAbilities(7, 19, 19, 20, 17, 20, 13, 17), new PlayerStats(21, 1715, 3, 2, 0)));
        playerModels.add(new PlayerModel(8, "Domagoj", "Ajman", 29, "FC", "https://scontent-frx5-1.xx.fbcdn.net/v/t1.0-1/c0.0.955.955/14606531_1375161719182926_3187872153032432519_n.jpg?oh=c337860986728bce089c29e61e4e1980&oe=5A2B9F95", 9, new PlayerAbilities(5, 14, 18, 18, 17, 19, 13, 13), new PlayerStats(15, 1148, 8, 1, 0)));
        playerModels.add(new PlayerModel(9, "Ante", "Budimir", 32, "CMF/DMF", "https://scontent-frt3-2.xx.fbcdn.net/v/t1.0-9/18057795_1442293815791317_6746114603697655483_n.jpg?oh=035ab17cc3d00d5a1c64d9e084f12922&oe=5A25ED35", 10, new PlayerAbilities(10, 17, 16, 19, 18, 18, 14, 20), new PlayerStats(21, 1871, 4, 4, 0)));
        playerModels.add(new PlayerModel(10, "Petar", "Culjak", 41, "CB", "https://scontent-frt3-2.xx.fbcdn.net/v/t1.0-9/483886_265979193536731_2068298456_n.jpg?oh=4aea3cf71d0c877547c6fcf587e91aa2&oe=59F56BD9", 11, new PlayerAbilities(20, 15, 13, 12, 10, 14, 18, 20), new PlayerStats(19, 1508, 0, 4, 0)));
        playerModels.add(new PlayerModel(11, "Bruno", "Saric", 22, "GK", "https://scontent-frt3-2.xx.fbcdn.net/v/t1.0-9/18221739_1452485674772131_476828398607284567_n.jpg?oh=f8cc6e0f51bf692427bdb1026328d1aa&oe=5A2A9AE0", 12, new PlayerAbilities(18, 13, 8, 2, 4, 8, 17, 12), new PlayerStats(19, 1710, 0, 1, 0)));
        playerModels.add(new PlayerModel(12, "Ante", "Paulic", 24, "RWB/RMF", "https://scontent-frt3-2.xx.fbcdn.net/v/t1.0-9/13432178_1015434611886555_1364564380904079370_n.jpg?oh=a16577b75e0c94ff12525b61676dddd3&oe=59F1C721", 13, new PlayerAbilities(12, 17, 17, 16, 18, 18, 10, 12), new PlayerStats(15, 1059, 1, 2, 1)));
        playerModels.add(new PlayerModel(13, "Josip", "Colak", 22, "FC", "https://scontent-frt3-2.xx.fbcdn.net/v/t31.0-8/18620590_1729670890391492_598012713495815542_o.jpg?oh=05a4580d832ea2e1129e82059901a10e&oe=59EFE585", 14, new PlayerAbilities(13, 19, 14, 11, 18, 16, 20, 18), new PlayerStats(5, 264, 1, 0, 0)));
        playerModels.add(new PlayerModel(14, "Karlo", "Antunovic", 15, "AMF/SS", "https://scontent-frt3-2.xx.fbcdn.net/v/t31.0-1/c0.0.960.960/p960x960/18588934_2287540551470324_9140096878744490923_o.jpg?oh=acac626cc6d91a840b54781e1673d142&oe=59EE20F6", 15, new PlayerAbilities(5, 11, 17, 11, 18, 15, 12, 10), new PlayerStats(6, 104, 1, 0, 0)));
        playerModels.add(new PlayerModel(15, "Stjepan", "Adzic", 24, "AMF/CMF", "https://scontent-frt3-2.xx.fbcdn.net/v/t1.0-9/14264808_10207596668977626_2307221628866390565_n.jpg?oh=ddcd33b61d59f856753ba4fe315ff93a&oe=5A2FA940", 16, new PlayerAbilities(6, 17, 15, 20, 18, 20, 13, 19), new PlayerStats(18, 958, 4, 0, 0)));
        playerModels.add(new PlayerModel(16, "Josip", "Pavic", 22, "DMF", "https://scontent-frt3-2.xx.fbcdn.net/v/t1.0-9/11238229_10205107776509382_5106570336895916410_n.jpg?oh=844d78208776bc69023511ac16a9bee7&oe=5A2B6F71", 17, new PlayerAbilities(13, 19, 17, 14, 15, 17, 16, 14), new PlayerStats(6, 520, 0, 1, 0)));

        return playerModels;
    }

    public static void loadDefaultImage(ImageView into) {
        ImageUtils.loadImage(into, "https://scontent-vie1-1.xx.fbcdn.net/v/t1.0-9/18581938_1407320175980850_4653485171212313419_n.jpg?oh=3e60cfc72cac5b26483a4d74b5d524a2&oe=5A37F874");
    }
}
