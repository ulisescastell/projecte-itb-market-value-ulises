import java.util.Scanner

fun main () {
    val scanner:Scanner = Scanner(System.`in`)
    println(getAscii())
    println(WHITE + "CALCULE EL PRECIO DE SU COCHE USADO" + RESET)
    println(WHITE + "Escoja su modelo (escriba un número):" + RESET)

    val cars:Array<String> = arrayOf(GREEN_BOLD + "Volkswagen Grand California", "Volkswagen Grand California Camper Full Equip" + RESET)
    val prices:FloatArray = floatArrayOf(73490f, 93490f)

    val userOption:Int = getCarType(cars, scanner)
    val purchasePrice:Float = getCarPrice(userOption, prices)

    val km:Int = getInt("Escriba los kilómetros que tiene su coche: ", 0, 2000000, scanner)
    val wheelsKm:Int = getInt("Escriba los kilómetros que tienen sus neumáticos: ", 0, 1000000, scanner)
    val finalPrice:Float = calculatePrice(purchasePrice, km, wheelsKm)

    println(PURPLE + "\nEl precio de compra de su ${cars[userOption-1]} fue de $purchasePrice€\nActualmente, su coche vale $finalPrice€" + RESET)


}

fun getCarType(cars:Array<String>, scanner:Scanner):Int {
    for (i in cars.indices) {
        println("${i+1} - ${cars[i]}")
    }

    return getInt("",1, cars.size, scanner)
}


fun getAscii(): String {
    return "                                                                       _______\n" +
            "                                               ________......--------''       \\\n" +
            "                                         _..-'                                 \\--.\n" +
            "                                  -----------------------------_________________   \\\n" +
            "                                  \\\\                                            `\\  )\n" +
            "                                   |\\                  `.   || :         :        \\ /\n" +
            "                                   ||                   .   '' `.........'        |/\n" +
            "                                   ||              .----._ .| -  -   -  .  .     //\n" +
            "                                   ||            _//     \\\\||- - . _  _       `\\//\n" +
            "                                   |-..-------------..___  ||           \\     __|\n" +
            "                         V        .        U             `-||         ___.---'  |\n" +
            "                         |     . '                     .   |\\_____.--'  |       |\n" +
            "                        ( )_-'                     .        \\           |    == |\n" +
            "                     .-----.`-.               .            ____       ==|     .-.__\n" +
            "             ._     /       \\  \\         .              .-'    `\\       |    /   .-\\\n" +
            "            /::\\\\  |/---.---.\\ .-.  .                  /     ___ \\      |   /   /   \\\n" +
            "           |::::|\\ ||||||||||./:::\\-_        ..iiii   /     /   \\ \\     |  /   / -. |\n" +
            "        __.|::::|/ |||||||||||:::::, \\ iiiiiiiiiiii  /     / |   \\ |    | /   .'d8b\\|\n" +
            "      .'    \\:://-_|||:F_P:|||:::::| | iiiiiiiiiiii .     / \\| / | |    |/    |   8b|\n" +
            "   .-'       //  \\ |||||||||||\\::::|/  iiiiiiiiiiii |    .'_ \\/\\ | |  _-/     | \\ `8\n" +
            "  /         //    \\||||||||||||`--'\\\\  ii-'       `-.    |  `-   | |-'  |     |\\   8\n" +
            " |      _   `      |||||||||||=   -'\\\\-'          ___`\\  |----() | |    |_    |-().8\n" +
            " |___.-' \\         ||||||||||/ \\--o\\/          .-'   `\\\\ |  _'// | | .-'  `--.|/ .8P\n" +
            "   /    / \\        |||||||||(   )-/'         .'        \\\\\\-' /\\ /  ''      .-'| //8\n" +
            "  /    /   \\     _-\\ \\|||||||`-'|/          /  d888b.   `\\  |/ /  '     .-'|  8_/8'\n" +
            "8o,   .     \\ _-'.-'\\   ''''''' |          /.d8P `Q88b   \\\\\\__/  /    .'    \\ `88'\n" +
            "`OO88o|      =/-'    `-._______/ \\        /dP' \\   \\88\\   \\\\_   /  _.'       `--'\n" +
            "8OO `8888ooo \\\\                   `------'dP   | /  .88\\   `==-'_.'\n" +
            "  `888o   `88888oo               _  /    .P    \\|    88 `-._____'\n" +
            "  `   `8888ooo  `o8888oooo    _____-|   .dP_    | / |88\n" +
            "   \\    `-._``888oo.__``8888OO8888888oo dP  `-. |   |88\n" +
            "    \\.          /``8888ooo  OO    `-888 8           |88\n" +
            "      `-._____.'      ``8888OO888888ooo 8------(()| 88/\n" +
            "                                   |888 8      /\\/ /88\n" +
            "                                   |    8     / | /88/\n" +
            "                                   |    8    /|  /d8/\n" +
            "                                   `    88  /   /d8/\n" +
            "                                    \\   `88b---888/\n" +
            "                                     \\   `888888P'\n" +
            "                                      `-.___.-'\n"
}
