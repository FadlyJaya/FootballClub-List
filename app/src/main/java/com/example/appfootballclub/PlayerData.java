package com.example.appfootballclub;

import java.util.ArrayList;

public class PlayerData {

    public static String data[][] = new String[][]{
            {"PSM Makassar","Indonesia","https://upload.wikimedia.org/wikipedia/id/thumb/b/b8/Logo_PSM_Makasar_Baru.png/225px-Logo_PSM_Makasar_Baru.png",
                    "Persatuan Sepak Bola Makassar (PSM Makassar) adalah sebuah tim sepak bola Indonesia yang berbasis di Makassar, Sulawesi Selatan, Indonesia PSM Makassar merupakan salah satu tim terkuat di Indonesia dan telah mewakili Indonesia dalam Liga Champions Asia sebanyak tiga kali.",
                    "Pasukan Ramang","2 November 1915","Andi Matalatta","Darije Kalezic"},
            {"PERSIB","Indonesia","https://upload.wikimedia.org/wikipedia/id/1/12/Logo_Persib.png",
                    "Persib Bandung adalah sebuah tim sepak bola Indonesia terbesar yang berdiri pada 14 Maret 1933, klub ini berbasis di Bandung, Jawa Barat. Persib saat ini bermain di Liga 1 2019 Indonesia.",
                    "Maung Bandung","14 maret 1933","Gelora Bandung Lautan Api","Robert Rene Albert"},
            {"PERSEBAYA","Indonesia","https://upload.wikimedia.org/wikipedia/id/f/f8/Logo_Persebaya_Surabaya.png",
                    "Persebaya Surabaya yang sempat merubah namanya menjadi Persebaya 1927 [2] adalah sebuah klub Sepak bola profesional di Indonesia yang berbasis di Surabaya",
                    "Bajul Ijo","18 Juni 1927","Gelora Bung Tomo","Djajang Nurjaman"},
            {"PERSIJA","Indonesia","https://upload.wikimedia.org/wikipedia/id/0/01/Logo_Persija_Jakarta.jpg",
                    "Persija (singkatan dari Persatuan Sepak Bola Indonesia Jakarta) adalah sepak bola Indonesia yang berbasis di Jakarta. Persija saat ini berlaga di Liga 1. Persija merupakan klub sepakbola paling sukses di sejarah sepakbola Indonesia dengan torehan 11 kali juara liga domestik hingga sejauh ini.",
                    "Macan Kemayoran","28 November 1928","Gelora Bung Karno","Julio Banuelos"},
            {"PERSIPURA","Indonesia","https://upload.wikimedia.org/wikipedia/id/0/08/Logo_Persipura_Jayapura.png",
                    "Persatuan Sepak bola Indonesia Jayapura (disingkat Persipura Jayapura) adalah sebuah klub sepak bola Indonesia yang bermarkas di Jayapura, Papua. Prestasi tertingginya hingga kini adalah menjadi empat kali juara Liga Indonesia dari tahun 2005 hingga 2013",
                    "Mutiara Hitam","1963","Mandala Jayapura","Luciano Leandro"},
            {"PSMS Medan","Indonesia","https://upload.wikimedia.org/wikipedia/id/0/0c/LogoPSMS.png",
                    "Persatuan Sepak Bola Medan Sekitarnya atau biasa disingkat PSMS Medan adalah sebuah klub sepak bola Indonesia yang berbasis di Medan, Sumatra Utara. PSMS Medan saat ini bermain di Liga 2 Indonesia.",
                    "Ayam Kinantan","21 April 1950","Teladan Medan","Abdul Rahman Gurning"},
            {"PSIS","Indonesia","https://upload.wikimedia.org/wikipedia/id/b/b3/PSIS_Semarang_logo.png",
                    "Persatuan Sepak Bola Indonesia Semarang atau PSIS Semarang adalah klub sepak bola yang bermarkas di kota Semarang, Indonesia dengan tempat berlatih dan bertanding di Stadion Jatidiri Semarang.PSIS Semarang adalah klub pertama di Liga Indonesia yang pernah menjadi juara Divisi Utama (1999) dan kemudian terdegradasi ke divisi I pada musim berikutnya (2000).",
                    "Laskar Mahesa Jenar","18 Mei 1932","Jatidiri Semarang","Jafri Sastra"},
            {"PERSELA","Indonesia","https://upload.wikimedia.org/wikipedia/id/c/cb/Logo_Persela_baru.png",
                    "Persatuan Sepak Bola Lamongan (biasa disingkat: Persela) adalah sebuah klub sepak bola Indonesia yang bermarkas di Lamongan, Jawa Timur. Persela dikelola oleh PT. Persela Jaya.",
                    "Laskar Joko Tingkir","18 April 1967","Surajaya Lamongan","Aji Santoso"},
            {"AREMA FC","Indonesia","https://upload.wikimedia.org/wikipedia/id/b/b9/Logo_Arema_FC_2017_logo.png",
                    "Arema FC (dahulu bernama Arema Malang), atau biasa disebut dan dikenal sebagai Arema Cronus, adalah sebuah klub sepak bola profesional yang berasal dari Malang, Jawa Timur, Indonesia",
                    "Singo Edan","11 Agustus 1987","Kanjuruhan","Milomoir Seslija"},
            {"BORNEO FC","Indonesia","https://upload.wikimedia.org/wikipedia/id/2/23/Logo_Borneo_FC.png",
                    "Borneo F.C. adalah klub sepak bola Indonesia yang berasal dari Samarinda, Kalimantan Timur. Klub ini bermain di Divisi Utama Liga Indonesia 2014 setelah mengakuisisi klub Perseba Super Bangkalan pada tanggal 7 Maret 2014, menggantikan Persisam Samarinda sebagai Klub asal samarinda, Kalimantan Timur",
                    "Pesut Etam","7 Maret 2014","Segiri, Samarinda","Mario Gomez"},
    };

    public static ArrayList<Player> getListData(){
        Player player = null;
        ArrayList<Player> list = new ArrayList<>();
        for (String[] aData : data)
        {
            player = new Player();
            player.setName(aData[0]);
            player.setRemarks(aData[1]);
            player.setPhoto(aData[2]);
            player.setDescription(aData[3]);
            player.setDateofbirth(aData[4]);
            player.setPlaceofbirth(aData[5]);
            player.setHeight(aData[6]);
            player.setPosition(aData[7]);


            list.add(player);
        }

        return list;
    }
}
