package id.ac.poliban.dts.ade.negaracustomlistview;

import java.util.ArrayList;
import java.util.List;

public class CountryData {
    static List<Country> getAllContries(){
        List<Country> data = new ArrayList<>();
        {
        data.add(new Country("https://id.wikipedia.org/wiki/Berkas:Flag_of_Indonesia.svg", "Indonesia", "iii"));
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/1/1a/Flag_of_Argentina.svg/125px-Flag_of_Argentina.svg.png", "Argentina", "Argentina (Spanish: [aɾxenˈtina]), officially the Argentine Republic[A] (Spanish: República Argentina), is a country located mostly in the southern half of South America. Sharing the bulk of the Southern Cone with Chile to the west, the country is also bordered by Bolivia and Paraguay to the north, Brazil to the northeast, Uruguay and the South Atlantic Ocean to the east, and the Drake Passage to the south."));
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Flag_of_Malaysia.svg/125px-Flag_of_Malaysia.svg.png", "Malaysia", "Malaysia (/məˈleɪziə, -ʒə/ (About this soundlisten) mə-LAY-zee-ə, -\u2060zhə; Malay: [məlejsiə]) is a country in Southeast Asia. The federal constitutional monarchy consists of 13 states and three federal territories, separated by the South China Sea into two similarly sized regions, Peninsular Malaysia and East Malaysia (Malaysian Borneo)."));
        data.add(new Country("https://upload.wikimedia.org/wikipedia/en/thumb/b/ba/Flag_of_Germany.svg/125px-Flag_of_Germany.svg.png", "Germany", "Germany (German: Deutschland, German pronunciation: [ˈdɔʏtʃlant]), officially the Federal Republic of Germany (German: Bundesrepublik Deutschland, About this soundlisten (help·info)),[h] is a country in Central and Western Europe, lying between the Baltic and North Seas to the north and the Alps, Lake Constance and the High Rhine to the south. It borders Denmark to the north, Poland and the Czech Republic to the east, Austria and Switzerland to the south, France to the southwest, and Luxembourg, Belgium and the Netherlands to the west."));
        data.add(new Country("https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Vietnam.svg/125px-Flag_of_Vietnam.svg.png", "Vietnam", "Vietnam (Vietnamese: Việt Nam pronounced [vîət nāːm] (About this soundlisten)), officially the Socialist Republic of Vietnam (Vietnamese: Cộng hòa xã hội chủ nghĩa Việt Nam), is the easternmost country on the Indochina Peninsula. With an estimated 94.6 million inhabitants as of 2016, it is the 15th most populous country in the world. "));
    }

        return data;
    }
}
