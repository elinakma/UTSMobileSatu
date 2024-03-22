package id.ac.pnm.ti.utsmobilesatu

fun main() {
    // Inisialisasi mutableList dan tambah data List
    val clubs = mutableListOf(
        Club("Liverpool", 19, 8, 9, 6, 3),
        Club("Manchester United", 20, 12, 5, 3, 1),
        Club("Chelsea", 6, 8, 5, 2, 2),
        Club("Manchester City", 8, 8, 8, 0, 0),
        Club("Arsenal", 13, 14, 2, 0, 0),
    )

    println("============================================================================================")

    // Pengurutan klub berdasarkan total trofi dari yang terbanyak ke tersedikit
    val sortedClubs = filterAndSort(clubs) { sortByNumberTrophyTotal(it) }
    // Print nama klub dan total trofi
    println("Urutan klub berdasarkan jumlah total trofi: ")
    for (club in sortedClubs) {
        println("${club.name}: ${club.totalTrophy}")
    }
    println("============================================================================================")

    // Filter clubs without UCL and UEL wins
    val filteredClubs = filterAndSort(clubs) { filterWithoutUCLUEL(it) }
    // Print club name only for filtered clubs
    println("Klub yang belum pernah memenangkan UCL dan UEL:")
    for (club in filteredClubs) {
        println(club.name)  // Print only club name
    }
    println("============================================================================================")

    val liverpool = Club(
        name = "Liverpool",epl = 19, fa = 8, efl = 9, ligaChampions = 6,ligaEuropa = 3
    )
    // Gunakan fungsi joinToString untuk menggabungkan daftar string menjadi satu kalimat
    val recap = listOf(
        "${liverpool.epl} trofi EPL",
        "${liverpool.fa} trofi FA",
        "${liverpool.efl} trofi EFL",
        "${liverpool.ligaChampions} trofi UCL",
        "${liverpool.ligaEuropa} trofi UEL"
    ).joinToString(", ")

    // Panggil extension function Club recap
    println("Liverpool berhasil meraih $recap.")
}

// High order function filter and sort
fun filterAndSort(clubs: List<Club>, options: (List<Club>) -> List<Club>): List<Club> {
    return options(clubs)
}

// Fungsi sorting
fun sortByNumberTrophyTotal(clubs: List<Club>): List<Club> {
    val sortedClubs = clubs.sortedByDescending { it.totalTrophy }
    return sortedClubs
}

// Fungsi filter (new) - filter clubs without UCL and UEL wins
fun filterWithoutUCLUEL(clubs: List<Club>): List<Club> {
    val filteredClubs = clubs.filter { it.ligaChampions == 0 && it.ligaEuropa == 0 }
    return filteredClubs
}