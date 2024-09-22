package com.polban.jtk.jadwal;

public class Main {
    public static void main(String[] args) {

        Dosen[] dosen = {
                new Dosen("Dr. Daffa", "123450"),
                new Dosen("Dr. Al", "123451"),
                new Dosen("Dr. Ghifari", "123452"),
                new Dosen("Dr. Carissa", "123453"),
                new Dosen("Dr. Amanda", "123454"),
                new Dosen("Dr. Chrisanty", "123455"),
                new Dosen("Dr. Lesmana", "123456"),
                new Dosen("Dr. Daiva", "123457"),
                new Dosen("Dr. Raditya", "123458"),
                new Dosen("Dr. Pradipa", "123459"),
        };

        Mahasiswa[] mahasiswa = {
                new Mahasiswa("Inggie", "231511030"),
                new Mahasiswa("Diva", "231511031"),
                new Mahasiswa("Syahla", "231511032"),
                new Mahasiswa("Khofifah", "231511033"),
                new Mahasiswa("Rafly", "231511034"),
                new Mahasiswa("Ahkamil", "231511035"),
                new Mahasiswa("Muhammad", "231511036"),
                new Mahasiswa("Raihan", "231511037"),
                new Mahasiswa("Pratama", "231511038"),
                new Mahasiswa("Thresna", "231511039"),
        };

        Ruangan[] ruangan = {
                new Ruangan("D01"),
                new Ruangan("D02"),
                new Ruangan("D03"),
                new Ruangan("D04"),
                new Ruangan("D05"),
                new Ruangan("D06"),
                new Ruangan("D07"),
                new Ruangan("D08"),
                new Ruangan("D09"),
                new Ruangan("D10"),
        };

        MataKuliah[] mataKuliah = {
                new MataKuliah("Aljabar Linear, Komputer Grafik, Pemrograman Berorientasi Objek"),
                new MataKuliah("Komputer Grafik, Basis Data, PRPL"),
                new MataKuliah("Pemrograman Berorientasi Objek, Dasar Dasar Pemrograman, Sistem Operasi"),
                new MataKuliah("Basis Data, Bahasa Inggris, PRPL"),
                new MataKuliah("Proyek 3"),
                new MataKuliah("PRPL"),
                new MataKuliah("Matematika Diskrit 2"),
                new MataKuliah("Dasar Dasar Pemrograman"),
                new MataKuliah("Sistem Operasi"),
                new MataKuliah("Bahasa Inggris"),
        };

        // Create an array for the weekly schedule
        JadwalHarian[] jadwalMingguan = new JadwalHarian[5]; // For Monday to Friday
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};

        // Define start and end times for each day
        String[] waktuMulai = {"08:00", "09:00", "08:30", "10:00", "07:30"};
        String[] waktuSelesai = {"15:00", "16:00", "15:30", "17:00", "14:30"};

        // Populate the weekly schedule with custom times
        for (int i = 0; i < hari.length; i++) {
            jadwalMingguan[i] = new JadwalHarian(
                    hari[i],
                    waktuMulai[i],
                    waktuSelesai[i],
                    ruangan[i % ruangan.length],  // Rotate through rooms
                    mataKuliah[i % mataKuliah.length],  // Rotate through subjects
                    dosen[i % dosen.length],  // Rotate through lecturers
                    mahasiswa
            );
        }

        // Display the weekly schedule
        System.out.println(AkademikPOLBAN.namaInstitusi);
        for (JadwalHarian jadwal : jadwalMingguan) {
            System.out.println("Jadwal: " + jadwal.hari);
            System.out.println("Waktu mulai: " + jadwal.waktuMulai);
            System.out.println("Waktu selesai: " + jadwal.waktuSelesai);
            System.out.println("Ruangan: " + jadwal.ruangan.kodeRuangan);
            System.out.println("Mata Kuliah: " + jadwal.mataKuliah.namaMatkul);
            System.out.println("Dosen: " + jadwal.dosen.nama);
            System.out.println("Mahasiswa:");
            for (Mahasiswa m : jadwal.mahasiswa) {
                System.out.println(m.nama);
            }
            System.out.println(); // Add an empty line between days
        }
    }
}
