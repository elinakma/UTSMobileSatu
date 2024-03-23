package id.ac.pnm.ti.utsmobilesatu

data class Club(
    val name: String, // nama club
    val epl: Int, // trofi epl
    val fa: Int,  // trofi fa
    val efl: Int,  // trofi efl
    val ligaChampions: Int,  // trofi liga champions
    val ligaEuropa: Int   // trofi liga eropa
)

{
    val totalTrophy: Int
        get() = epl + fa + efl + ligaChampions + ligaEuropa

    fun recap(): String {
        return "$name berhasil meraih $epl trofi Liga Primer Inggris, " +
                "$fa trofi FA, " +
                "$efl trofi EFL, " +
                "$ligaChampions trofi Liga Champions, " +
                "dan $ligaEuropa trofi Liga Europa UEFA. " +
                "Sehingga Total Trofi adalah $totalTrophy"
    }
}