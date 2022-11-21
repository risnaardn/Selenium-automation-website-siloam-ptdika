Feature: Upload data
  Scenario: Upload data valid
    When Klik button Foto Faskes Awal untuk upload foto dokumen
    And Klik button choose File
    And Mengambil data foto
    And Klik simpan untuk menyimpan foto
    And Keluar dari pop up upload foto faskes awal
    And klik button foto faskes tujuan untuk upload data
    And klik button choose file faskes tujuan
    And mengambil data foto faskes awal
    And klik simpan untuk menympan foto faskes awal
    And keluar dari pop up upload foto faskes tujuan
    And klik button foto ttd digital tujuan untuk upload data
    And klik button choose file ttd digital
    And mengambil data foto ttd digital
    And klik simpan untuk menympan foto ttd digital
    And keluar dari pop up upload foto ttd digital
    Then klik button selanjutnya


