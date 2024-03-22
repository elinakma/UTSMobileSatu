package id.ac.pnm.ti.utsmobilesatu

data class Club(
    val name: String,
    val epl: Int,
    val fa: Int,  // FA Cup trophy
    val efl: Int,  // EFL Cup trophy
    val ligaChampions: Int,  // Champions League trophy
    val ligaEuropa: Int   // Europa League trophy
)
{
    val totalTrophy: Int
        get() = epl + fa + efl + ligaChampions + ligaEuropa

    fun recap(): String {
        return "Club Name: $name\n" +
                "EPL Titles: $epl\n" +
                "FA Cup Titles: $fa\n" +
                "EFL Cup Titles: $efl\n" +
                "Champions League Titles: $ligaChampions\n" +
                "Europa League Titles: $ligaEuropa\n" +
                "Total Trophies: $totalTrophy"
    }

}