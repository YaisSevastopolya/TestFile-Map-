data class Data(
    val x: Int = 1,
    val y: Int = 2,
    val panda: List<String> = listOf("   ____________________________,d888888888b,\n" + "___________________________d8888888888888b_________________________,ad8ba,_\n" + "___________ _______________d888888888888888______________________,d888888888b,\n" + "__________________________I8888888888888888____________________,88888888 88888b\n" + "__________________________`Y88888888888888P\"\"\"\"\"\"\"\"\"\"\"baaa,___,____888888888888888\n" + "____________,adP\"\"\"\"\"\"\"\"\"\"\"9888888888P\"\"^_______ __________^\"\"Y8888888888888888888I\n" + "_________,a8\"^___________,d888P\"888P^___________________________^\"Y8888888888P'\n" + "_______,a8^____________ ,d8888'_____________________________________^Y8888888P'\n" + "______a88'___________,d8888P'________________________________________I88P\"^\n" + "____,d 88'___________d88888P'__________________________________________\"b,\n" + "___,d88'___________d888888'____________________________________________ `b,\n" + "__,d88'___________d888888I______________________________________________`b,\n" + "__d88I___________,8888888'________________________________ _______________`b,\n" + "_,888'___________d8888888__________,d88888b,______________________________`b,\n" + "_d888___________,8888888I_________d888888 88b,___________,d8888b,___________`b\n" + ",8888___________I8888888I________d8888888888I__________,88888888b___________8,\n" + "I8888___________888888 88b_______d88888888888'__________8888888888b__________8I\n" + "d8886___________888888888_______Y888888888P'___________Y8888888888,________,8b\n" + "88 888b__________I88888888b______`Y8888888^_____________`Y888888888I________d8\n" + "Y88888b_________`888888888b,______`\"\"\"\"^________________`Y88888 88P'_______d888I\n" + "`888888b_________88888888888b,___________________________`Y8888P^________d888\n" + "_Y888888b_______,8888888888888ba,__________ ________________`\"\"^________,d88888\n" + "_I8888888b,____,888888888888888888ba,______d88888888b_______________,ad8888888I\n" + "_`888888888b,__I888888 8888888888888888b,____^\"Y888P\"^__________.,ad88888888888I\n" + "__88888888888b,`888888888888888888888888b,_____\"\"______ad888888888888888888888'\n" + "_ _8888888888888698888888888888888888888888b_,ad88ba,_,d88888888888888888888888\n" + "__88888888888888888888888888888888888888888b,`\"\"\"^_d888888888 8888888888888888I\n" + "__8888888888888888888888888888888888888888888baaad888888888888888888888888888'\n" + "__Y88888888888888888888888888888888888888 88888888888888888888888888888888888P\n" + "__I888888888888888888888888888888888888888888888P^__^Y8888888888888888888888'\n" + "__`Y88888888888888888P8 8888888888888888888888888'_____^88888888888888888888I\n" + "___`Y8888888888888888_`8888888888888888888888888_______8888888888888888888P'\n" + "____`Y8 88888888888888__`888888888888888888888888,_____,888888888888888888P'\n" + "_____`Y88888888888888b__`88888888888888888888888I_____I888888888888888 888'\n" + "_______\"Y8888888888888b__`8888888888888888888888I_____I88888888888888888'\n" + "_________\"Y88888888888P___`888888888888888888888b_____d8888 888888888888'\n" + "____________^\"\"\"\"\"\"\"\"^______`Y88888888888888888888,____888888888888888P'\n" + "_____________________________\"8888888888888888888b, ___Y888888888888P^\n" + "______________________________`Y888888888888888888b___`Y8888888P\"^\n" + "________________________________\"Y8888888888888888P_ ____`\"\"\"\"^\n" + "__________________________________`\"YY88888888888P'\n" + "_______________________________________^\"\"\""),
    val firstGirl: List<String> = listOf("______________8888ooo8888888888888888888888888\n" + "_____________8888oooooo8888888888888888888888888888\n" + "____________88oooooooo888ooo8888888888888888888888888\n" + "__________88888888oooo8ooooooooooo88888888888888888888\n" + "________888_8oo888888oooooooooooooooooo88888888888 888\n" + "___________88oooo88888888oooomoooooooooo88888888888 8\n" + "_________888888888888888888oMooooooooooo8888888888888\n" + "________88888888888888888888ooooooooooooM88888888888888\n" + "________8888888888888888888888oooooooooM8888888888888888\n" + "_________8888888888888888888888oooooooM888888888888888888\n" + "________8888888888888888oo88888ooooooM88888888888888888888\n" + "______88888888888888888ooo88888oooooM888888888888888 8888\n" + "_____88888888888888888ooo88888ooooMoo;o*M*o;888888888 88\n" + "____88888888888888888ooo8888oooooMooooooooooo88888888 8\n" + "___88888888888888888oooo88ooooooMo;ooooooooooo888888888\n" + "__8888888888888888888ooo8ooooooMooaAaooooooooM8888888888_______\n" + "__88___8888888888oo88oooo8ooooMooooooooooooo888888888888888_8888\n" + "_88__88888888888ooo8oooooooooMoooooooooo;oo88o88888888888888888\n" + "_8__8888888888888oooooooooooMoo\"@@@@@\"oooo8w8888888888888888\n" + "__88888888888o888ooooooooooMooooo\"@a@\"oooooM8i888888888888888\n" + "_8888888888oooo88oooooooooM88oooooooooooooM88z88888888888888888\n" + "8888888888ooooo8oooooooooM88888oooooooooMM888!888888888888888888\n" + "888888888ooooo8oooooooooM8888888MAmmmAMVMM888*88 888888___88888888\n" + "888888_MoooooooooooooooM888888888oooooooMM88888888888888___8888888\n" + "8888___MooooooooooooooM88888888888ooooooMM888888888888888____88888\n" + "_888___MoooooooooooooM8888888888888MooooomM888888888888888____8888\n" + "__888__MooooooooooooM8888o888888888888oooomooMm88888_888888___8888\n" + "___88__Moooooooooooo8888o88888888888888888ooooooMm8___88888___888\n" + "___88__Moooooooooo8888Moo88888oo888888888888oooooooMm88888____88\n" + "___8___MMoooooooo8888Mooo8888ooooo888888888888ooooooooMm8_____8\n" + "_______8Mooooooo8888Mooooo888ooooooo88ooo8888888ooooooooMm____8\n" + "______88MMooooo8888Mooooooo88oooooooo8ooooo888888oooMoooooM\n" + "_____8888Mooooo888MMoooooooo8oooooooooooMoooo8888ooooMooooM\n" + "____88888Mooooo88oMoooooooooo8oooooooooooMooo8888ooooooMooM\n" + "___88_888MMooo888oMoooooooooooooooooooooooMo8888oooooooooMo\n" + "___8_88888Mooo88ooMoooooooooooooooooooooooMMo88ooooooooooooM\n" + "_____88888Mooo88ooMoooooooooo*88*ooooooooooMo88ooooooooooooooM\n" + "____888888Mooo88ooMooooooooo88@@88ooooooooMoo88ooooooooooooooM\n" + "____888888MMoo88ooMMoooooooo88@@88oooooooMooo8ooooooooooooooo*8\n" + "____88888__Mooo8ooMMooooooooo*88*ooooooooooMooooooooooooooooo88@@\n" + "____8888___MMooooooMMoooooooooooooooooooooMMooooooooooooooooo88@@\n" + "_____888____MoooooooMMoooooooooooooooooooMMooMooooooooooooooooo*8\n" + "_____888____MMoooooooMMMooooooooooooooooMMoooMMoooooooooooooooM\n" + "______88_____MooooooooMMMMoooooooooooMMMMoooooMMooooooooooooMM\n" + "_______88____MMoooooooooMMMMMMMMMMMMMooooooooMMMooooooooMM\n" + "________88____MMooooooooooooMMMMMMMooooooooooooMMMMMMMMMM\n" + "_________88___8MMooooooooooooooooooooooooooooooooooMMMMMM\n" + "__________8___88MMooooooooooooooooooooooMoooMooooooooMM\n" + "______________888MMooooooooooooooooooMMooooooMMooooooMM\n" + "_____________88888MMoooooooooooooooMMMooooooomMoooooMM\n" + "_____________888888MMoooooooooooooMMMoooooooooMMMoooM\n" + "____________88888888MMoooooooooooMMMoooooooooooMMoooM\n" + "___________88_8888888MoooooooooMMMooooooooooooooMoooM\n" + "___________8__888888_MoooooooMMoooooooooooooooooMoooMo\n" + "______________888888_MooooooMoooooooooooooooooooMoooMM\n" + "_____________888888__MoooooMooooooooooooooooooooooooMoM\n" + "_____________888888__MoooooMooooooooo@ooooooooooooooMooM\n" + "_____________88888___Moooooooooooooo@@oooooooooooooooMooM\n" + "____________88888___Moooooooooooooo@@@ooooooooooooooooMooM\n" + "___________88888___Mooooooooooooooo@@ooooooooooooooooooMooM\n" + "__________88888___Mooooomoooooooooo@ooooooooooMmoooooooMoooM\n" + "__________8888___MoooooMoooooooooooooooooooooooMMoooooooMoooM\n" + "_________8888___MoooooMoooooooooooooooooooooooMMMooooooooMoooM\n" + "________888____MoooooMmooooooooooooooooooooooMMMoooooooooMooooM\n" + "______8888____MMooooMmoooooooooooooooooooooMMMMooooooooomoomoooM\n" + "_____888______MoooooMooooooooooooooooooooMMMooooooooooooMoommoooM\n" + "__8888_______MMoooooooooooooooooooooooooMMooooooooooooomMooMMoooMo\n" + "_____________MoooooooooooooooooooooooooMooooooooooooooomMooMMoooMm\n" + "____________MMoooooomoooooooooooooooooooooooooooooooooooMooMMoooMM\n" + "____________MooooooooMoooooooooooooooooooooooooooooooooooMooMoooMM\n" + "___________MMoooooooooMoooooooooooooMoooooooooooooooooooooMoMoooMM\n" + "___________MoooooooooooM88oooooooooMoooooooooooooooooooooooMMooMMM\n" + "___________Moooooooooooo8888888888MooooooooooooooooooooooooMMooMM\n" + "___________Mooooooooooooo88888888MoooooooooooooooooooooooooMooMM\n" + "___________Moooooooooooooo888888MoooooooooooooooooooooooooMooMM\n" + "___________Mooooooooooooooo88888MoooooooooooooooooooooooooMoMM\n" + "___________Mooooooooooooooooo88MooooooooooooooooooooooooooMMM\n" + "___________MoooooooooooooooooooMooooooooooooooooooooooooooMMM\n" + "___________MMoooooooooooooooooMooooooooooooooooooooooooooMMM\n" + "____________MoooooooooooooooooMooooooooooooooooooooooooooMMM\n" + "____________MMoooooooooooooooMooooooooooooooooooooooooooMMM\n" + "_____________MoooooooooooooooMoooooooooooooooooooooooooMMM\n" + "_____________MMoooooooooooooMoooooooooooooooooooooooooMMM\n" + "______________MoooooooooooooMooooooooooooooooooooooooMMM\n" + "______________MMoooooooooooMooooooooooooooooooooooooMMM\n" + "_______________MoooooooooooMoooooooooooooooooooooooMMM\n" + "_______________MMoooooooooMoooooooooooooooooooooooMMM\n" + "________________MoooooooooMooooooooooooooooooooooMMM\n" + "________________MMoooooooMooooooooooooooooooooooMMM\n" + "_________________MMooooooMoooooooooooooooooooooMMM\n" + "_________________MMoooooMoooooooooooooooooooooMMM\n" + "__________________MMooooMooooooooooooooooooooMMM\n" + "__________________MMoooMooooooooooooooooooooMMM\n" + "___________________MMooMoooooooooooooooooooMMM\n" + "___________________MMoMoooooooooooooooooooMMM\n" + "____________________MMMooooooooooooooooooMMM\n" + "____________________MMooooooooooooooooooMMM\n" + "_____________________MoooooooooooooooooMMM\n" + "____________________MMooooooooooooooooMMM\n" + "____________________MMoooooooooooooooMMM\n" + "____________________MMooooMoooooooooMMMo\n" + "____________________mMMooooMMoooooooMMMM\n" + "_____________________MMMoooooooooooMMMoM\n" + "_____________________mMMoooMoooooooMoMoM\n" + "______________________MMooMMMMoooooooMoM\n" + "______________________MMooMMMooooooooMoM\n" + "______________________mMMooMMooooooooMoM\n" + "_______________________MMooMMoooooooooMoM\n" + "_______________________MMooMMooooooooooMom\n" + "_______________________MMoooMoooooooooooMM\n" + "_______________________MMMoooooooooooooooMo\n" + "_______________________MMMoooooooooooooooMo\n" + "_______________________MMMooooooooooooooooM\n" + "_______________________MMMooooooooooooooooM\n" + "_______________________MMMooooooooooooooooMm\n" + "________________________MMooooooooooooooooMM\n" + "________________________MMMoooooooooooooooMM\n" + "________________________MMMoooooooooooooooMM\n" + "________________________MMMoooooooooooooooMM\n" + "________________________MMMoooooooooooooooMM\n" + "_________________________MMooooooooooooooMMM\n" + "_________________________MMMoooooooooooooMM\n" + "_________________________MMMoooooooooooooMM\n" + "_________________________MMMooooooooooooMM\n" + "__________________________MMooooooooooooMM\n" + "__________________________MMooooooooooooMM\n" + "__________________________MMoooooooooooMM\n" + "__________________________MMMooooooooooMM\n" + "__________________________MMMooooooooooMM\n" + "___________________________MMoooooooooMM\n" + "___________________________MMMooooooooMM\n" + "___________________________MMMooooooooMM\n" + "____________________________MMooooooooMM\n" + "____________________________MMMooooooMM\n" + "____________________________MMMooooooMM\n" + "_____________________________MMooooooMM\n" + "_____________________________MMooooooMM\n" + "______________________________MMoooooMM\n" + "______________________________MMoooooMMo\n" + "______________________________MMoooooMoM\n" + "______________________________MMoooooMoM\n" + "______________________________oMooooooMo\n" + "_____________________________MoMoooooooM\n" + "____________________________MoooMooooooM\n" + "___________________________MooooMooooooM\n" + "__________________________MoooooMoooooooM\n" + "_________________________MooooooMMoooooooM\n" + "_________________________MoooooooMooooooooM\n" + "_________________________M;o;ooooMoooooooooM\n" + "_________________________Momo;oooMooooooooooM\n" + "_________________________MMomomooMoooooooo;oM\n" + "__________________________MMomooMMooooooo;o;M\n" + "___________________________MMooMMMoooooo;omoM\n" + "___________________________MMMM_MMoooomomoMM\n" + "__________________________________MMoooomoMM\n" + "___________________________________MMooooMM\n" + "____________________________________MMooMM"),
    val secondGirl: List<String> = listOf("________________________________________m8888888\n" + "___________________________________mMoooooooM8888\n" + "_________________________________Mogggo oooooM88888\n" + "___________________________MMMMMoooooooooooM8888888\n" + "___________________________M6ooooMMMmoooooooM888888888\n" + "__________________ ______Mmooo8oooooooooooooM88888888888\n" + "_______________________MmmmooooooooooooooM88888888888888\n" + "______________________Moooooooooo8888888M88 88888888888888\n" + "_____________________Mooooooooooooo88888M88888888888888888\n" + "______________________MmooooooooooooooommM88888888888888888\n" + "___ _______________________M88ooooo888mooMM88888888888888888\n" + "___________________________M88888888oommooM88888888888888888\n" + "____________________ ________M888888ooooMM8888888888888888888\n" + "____________________________MooooooooooM888888888888888888888\n" + "_________________________888Moooooo oooM8888888888888888888888\n" + "______________________888888MooooooooM88888888888888888888888\n" + "_____________________88888888MoooooooM8888888888m mmm888888888\n" + "____________________888888888Mo8oooooM8888888MooooooooM888888\n" + "___________________8888888888Moo8oooM8888MM8ooooooooooooM88888\n" + "_ __________________8888888888Mooo88ooooM888MoooooooooooooM8888\n" + "____________________M8o8888ooo8oo88ooo0ooMMoo888oooooooooooM88\n" + "_____________ ______Mooo88888ooo8o88o8oooooooooo8888oooooooooM8\n" + "___________________Moo8888o8ooooo8ooooooooooooooo8888ooooooooM8\n" + "___________________Mooo8 8oooooooooooooooooooooooo888888oooooooM8\n" + "___________________Mooooooooooooooooooooooooooooo88888888ooooooM8\n" + "____________________MooMooooooo oooooooooooooooooooM888ooo88oooooM\n" + "_____________________Mmoooooooooooooooooooooooooo888Moooo8oooooooM\n" + "______________________Moooooooooo8oo oooooooooooo8888MMooooooooooooM\n" + "_______________________Moooooooo88ooooooooooooo88888MMM8oooooooooooM\n" + "_______________________Moooooooo88ooo ooooooooooo88888MMMMoooooooooooM\n" + "_______________________Moooooooo88Moooooooooooooooo88888MMMMoooooooooM\n" + "______________________Mooooooooo88 Moooooooooooooooo8MooooMMMMoooooooooM\n" + "_____________________Mooooooooo8MMooooooooooooooo88MoooooMMMMooooooooooM\n" + "____________________Moooooo ooo88MMoom888mooooooo88MooooooMM_MMooooooooooM\n" + "____________________M8moooooo888MMoom@@8moooo8888M8oooooooMM__MMoooooooooM\n" + "________________ ___M@88moooo888MooMom8@8mooo8888MoooooooooMM___Mmoooooo000M\n" + "____________________*M8mooo8888MooooMm8mooo888M888ooooooooMM___Moooooo00000M\n" + "_ ______________________MMMMMM8888oooooMMmmmmM88888oooooooooMM_Moooooooo0008M\n" + "_____________________________M88Moooooo8888888888oooooooooooMMo ooooooooo88M\n" + "_____________________________M88Mooooo8o888888888ooooooooooooMoooooooo888M\n" + "______________________________M88Mooooo8ooo888888o ooooooooooMooooooo8888M\n" + "_______________________________M888Mooo888ooooo888ooooooooooMoooooo8888M\n" + "_______________________________M88888Moo8 88oooooo8888ooooooMooooooo888M88M\n" + "________________________________M888888Mo8888oooooo8888oooMooooooo888M88888M\n" + "___________________________ ______M8888888Mo8888ooooooooooMoooooooo88M88888888M\n" + "___________________________________M888888M88888oooooooooMoooooooo8M88888888888M\n" + "_____ _______________________________M8oo888M888888ooooooMoooooooo8M888888oooo888M\n" + "_____________________________________M8ooooMM88888888ooMoooooo ooM8888oooooooooooo8M\n" + "______________________________________MooooM_M88888888MooooooooM888ooooooooooooooo8M\n" + "_______________________________ ________MooooM_M888888Mooooooo8M88**ooooooooooooooo88M\n" + "________________________________________MooooM_mmmmmmMoooooo8Mmooooooooooooooooooo88 8M\n" + "_________________________________________MoooQooommmmMoooMMooooooooooooooooooooooo888M\n" + "________________________________________MM88ooo8 ooooMMMoooooooooooooooooooooooooo8888M\n" + "_____________________________________mM8888M88o88mMmoooooooooooooooooooooooooooo88888M\n" + "____________ ___________________mMMMoooooooooM888Mmooooooooooooooooooooooooooooo888888M\n" + "__________________________MMMMoooooooooooooooMMooooooooooooooooo oooooooooooooo888888M\n" + "______________________MMMoooooooooooooooooMMooooooooooooooooooooooooooooooo88888888M\n" + "___________________MMMooooooooo oooooooooMMooooooooooooooooooooooooooooo88888888888M\n" + "________________MMooooooooooooooooooooMMooooooooooooooooooooooooooooo8888888888M\n" + "____ _________MMoooooooooooooooooooooMMooooooooooooooooooooooooooo888888888888MMM\n" + "___________MmoooooooooooooooooooooMMoooooooooooooooooooooooooo 888888888888M88888M\n" + "_________MooooooooooooooooooooooMooooooooooooooooooooooooooo88888888888MM_M8888888M\n" + "_______MoooooooooooooooooooooooMoo ooooooooooooooooooooooo8888888888M_____M8888888888M\n" + "______M8ooooooooooooooooooo88Mooooooooooooooooooooooo88888888888M_______M8888888888888M\n" + "______M88oooooooooooo8888888Moooooooooooooooooooooo888888MMMMMMMMMMMM888888888888888888888M\n" + "______M8888ooooooo88888MMMMMooooooooooooooooo oooo8888M888888888888888888888888888888888888888M\n" + "_______M888888888888MMM888Moooooooooooooooooooo88M8ooooooooooo8888888888888888888888MMMMM MMMMMMM\n" + "________M888888888888oooooMoooooooooooooooooooMMoooooo8888888888888888888888MMM\n" + "_________M8888888888888888M8888oooooo88ooooooMoo88 8888888888888888888MM\n" + "____________MMMMMMMMMMMMMMM888888ooo88888oo8Mo888888888888888888MM\n" + "_____________________________M8888888888888Mo8888 88888888MMM\n" + "_______________________________M88888888888MMMMMMM\n" + "__________________________________MMMMM"),
    val dragon: List<String> = listOf("__________________________________________________ __________________\n" + "________________________________________\$,__\$,____ _, ________________\n" + "________________________________________\"ss.$.ss._. s\" _________________\n" + "________________________________,_____.ss\$\$\$\$\$\$\$\$\$ $.s, _______________\n" + "________________________________\$._s\$\$\$\$\$\$\$\$\$\$\$\$\$\$ `\$$.Ss ____________\n" + "________________________________\"\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$ $.o\$\$$._______, _____\n" + "_______________________________s\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$ \$\$\$\$\$$.s,__,s ______\n" + "______________________________s\$\$\$\$\$\$\$\$\$\"\$\$\$\$\$\$\"\"\" \"\$\$\$\$\$\$\"\$\$\$\$\$, _____\n" + "______________________________s\$\$\$\$\$\$\$\$\$$.s\"\"\$\$\$$.ss ssss\"\$\$\$\$\$\$\$\$\" ____\n" + "_____________________________s\$\$\$\$\$\$\$\$\$\$\"_________ `\"\"\"ss\"\$\"$.s\"\" _______\n" + "_____________________________s\$\$\$\$\$\$\$\$\$\$,_________ _____`\"\"\"\"\"$.__.s\$$.s _\n" + "_____________________________s\$\$\$\$\$\$\$\$\$\$\$$.s,...___ ____________`s\$\$\"__`\n" + "_________________________`ssss\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$# ###s._____.\$\$\"\$.___,\n" + "___________________________`\"\"\"\"\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$ \$\$#####\$\$\$\$\$\$\"_____\n" + "_________________________________\"\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$ \$\$\$\$\$####s\"\"_____.\n" + "__________________________________\"\$\$\$\$\$\$\$\$\$\$\$$.fri ga\$\$\$\$\$\$\$##s____.\$\n" + "___________________________________\$\$\"\"\$\$\$\$\$\$\$\$\$\$\$ \$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\n" + "__________________________________\$\$\"__\"\$\"\$\$\$\$\$\$\$\$ \$\$\$\$\$\$\$\$\$\$\$$.S\"\"\"\"\"\n" + "_____________________________,___,\"_____\"__\$\$\$\$\$\$\$ \$\$\$\$\$\$\$\$\$####s _____\n" + "_____________________________\$.__________.s\$\$$.frig a\$\$\$\$\$\$\$\$\$####\" ___\n" + "_________________,___________\"$.s.___..ssS\$\$\$\$\$\$\$\$\$ \$\$\$\$\$\$\$\$\$\$####\" ____\n" + "_________________$.___________.\$\$$.S\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$ \$\$\$\$\$\$#####\" ______\n" + "_________________Ss_____..sS\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$ \$\$\$######\"\" _______\n" + "__________________\"\$$.sS\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$## ######\" __________\n" + "___________,______s\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$######### \"\"\" _______________\n" + "___________$.____s\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$#######\"\"\"____ __s\"_________, _____\n" + "___________\$\$..\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$######\"\"_______.... ,\$\$....____,\$ __________\n" + "____________\"\$\$\$\$\$\$\$\$\$\$\$\$\$######\"\"_,_____.sS\$\$\$\$\$\$ \$\$\$\$\$\$\$\$\$$.s\$\$ _____\n" + "______________\$\$\$\$\$\$\$\$\$\$#####\"_____\$,_.s\$\$\$\$\$\$\$\$\$\$ \$\$\$\$\$\$\$\$\$\$\$\$\$$.s. __\n" + "___)__________\$\$\$\$\$\$\$\$\$#####\"______`\$\$\$\$\$\$\$\$\$##### ######\$\$\$\$\$\$\$\$\$\$\$.\n" + "((__________\$\$\$\$\$\$\$\$\$#####_______\$\$\$\$\$\$\$\$###\"_____ __\"####\$\$\$\$\$\$\$\$\$\$ )_\n" + "\\_________\$\$\$\$\$\$\$\$\$\$####._____\$\$\$\$\$\$###\"__________ ___\"###\$\$\$\$\$\$\$\$\$\$\$\n" + "(___________\$\$\$\$\$\$\$\$\$\$\$####.___\$\$\$\$\$###\"__________ ______####\$\$\$\$\$\$\$$.s\n" + "___ (_______\$\$\"\$\$\$\$\$\$\$\$\$#####.\$\$\$\$\$###\"_______________ .###\$\$\$\$\$\$\$\$\$\$\"\n" + "_(__)__)____,\$\"_\$\$\$\$\$\$\$\$\$\$\$\$######.\$\$##\"__________ ______.###\$\$\$\$\$\$\$\$\$\$\n" + "_)_(__(_\\._______\"\$\$\$\$\$\$\$\$\$\$\$\$\$#######,,,.________ __..####\$\$\$\$\$\$\$\$\$\$\$\" __\n" + "(___)$._)__)______,\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$############## ######\$\$\$\$\$\$\$\$\$\$\$\" _\n" + "(___(\$$.__(_\\____sS\"__`\"\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$ \$\$\$\$\$\$\$\$\$\$\$\$\$$.S\$\$, __\n" + "_)__)\$\$$.s_)_)__.____.___.FRIGA\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$ \$\$\$\$\$\$\$\$\$\$\$\$\"\"__`\$\$ __\n" + "__(___\$\$$.Ss/__.\$,__.\$,,s\$\$\$\$$.F##S\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$$.S\"\"__ ______\" __\n" + "____\\)_\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$##\"__\$$.________`\$\$.___ _____`\$\$. __________\n" + "________`\"S\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$#\"______$.__________`$.___ _______`\$ _________\n" + "____________`\"\"\"\"\"\"\"\"\"\"\"\"_________\"___________\"___ ______________________\n" + "__________________________________________________ ________________________"),
    val lenin: List<String> = listOf("__________`\$+___`\$,___`\$,____d;_____,\n" + "____________`$.b,__`\$,___\$\$,__d\$'___,\$\n" + "_____________`\$\$+__l\$+__;\$$._d\$$.___,\$'____,\n" + "______________`\$$.b,;\$$.b,\$\$\$\$\$\$;_,d\$$.___,\$\n" + "_______________`\$\$$.b\$\$\$\$\$\$\$\$\$\$\$\$\$\$\$;_,d\$'\n" + "________________`\$\$\$*\"\"\"\"~~\"\"^+\$\$\$\$\$\$\$$.P____,,\n" + "________________*^______________~^\"\$\$\$\$;_,s\$'\n" + "______________,^____________________`\$\$\$\$\$\$'_____\n" + "_____________,'_______________________`\$\$\$'__,y\$\"\n" + "_____________'_________________ ________`\$\$,y\$\$\"\n" + "____________(___________________________`\$\$\$\$'\n" + "__________,^_______,,,_________,,,yyyyy,,`\$\$\$\$\$#=-\n" + "__________`\\,__,,/'^__``______`\$\$\$\$\$\$\$\$\$$.d;\$\$\$~\n" + "___________/'_,\$\$*=``-_____`$.b`?\$\$\$\$\$\$\$\$\$\$;\$\$$.b,\n" + "_________,'___`^*;-=''____`\$\$\$\$\$\$\$#\$\$\$\$\$\$\$;\$\$\$+$.b.\n" + "________(,,,;,_____________`+\$+\",+y+`?\$\$\$\$;$.b,\n" + "_________`;``\"_________________]\$&_\$';\$\$\$$.d\$\$$.b,\n" + "________,yyy,,________________•@@&`'d\$\$\$$.d$.P\"\"+\$,\n" + "________\\?`^\"\$@by,____________~+>^,\$\$\$\$$.d\$$.b,\n" + "________,&~`^\"+?~#`________,yb,_,?\$\$\$\$$.d\$\$\$$.b,\n" + "_______'___$.____,______,,yd\$\$\$\$\$=+=\$\$$.d\$\$~~\"+;\n" + "______/___'\$,_\$\$$.yyyyy\$\$\$\$\$\"_,\$\$\$•\$\$$.d\$\$$.b,\n" + "_____`-=##\$\$\$\$\$\$\$\$\$\$\$\$\$\$^~__,\$\$\$\$\$\$$.R\$'~__~`\n" + "___________~~\"\$\$\$\$\$\$\$\$\$'___,\$\$\$\$\$\$$.D\$'\n" + "_______________` #\$\$\$\$\$'___,\$\$\$`,\$$.Z\$\$\n" + "_________________`#\$\$'___,\$@P',\$$.o\$\$'\n" + "___________________`'=*yd\$$.P',\$$.N$.P'\n" + "________________________~~~\"•\$+\"~"),
    val homer: List<String> = listOf("````````````````````````````````__\n" + "``````````````````````````````_//_\\\\\n" + "````````````````````````````,\"````//\"..\\\n" + "```````````````````````````/``````````\\\n" + "`````````````````````````_/```````````|\n" + "````````````````````````(.-,--.````````/\n" + "````````````````````````/o/``o`\\`````/\n" + "````````````````````````\\_\\````/``/\\/\\\n" + "````````````````````````(__`--'```._)\n" + "````````````````````````/```-.`````|\n" + "```````````````````````(`````,`-.``|\n" + "`````````````````````````-,--\\_``)`|-.\n" + "`````````````````````````_`.__.'``,-'`\\\n" + "````````````````````````|\\`)``_.-'````|\n" + "````````````````````````i-\\.'\\`````,--+.\n" + "``````````````````````.'`.'```\\,-'/`````\\\n" + "`````````````````````/`/`````````/```````\\\n" + "`````````````````````7_|`````````|```````|\n" + "`````````````````````|/``````````\"i.___.j\"\n" + "`````````````````````/````````````|`````|\\\n" + "````````````````````/`````````````|`````|`\\\n" + "```````````````````/``````````````|`````|``|\n" + "```````````````````|``````````````|`````|``|\n" + "```````````````````|____``````````|`````|-i'\n" + "````````````````````|```\"\"\"\"----\"\"|`````|`|\n" + "````````````````````\\```````````,-'`````|/\n" + "``````````````````````.``````````-,`````|\n" + "``````````````````````|`-._``````/`/|`|\\`\\\n" + "``````````````````````|`````-.````'`|`||`-'\n" + "``````````````````````|``````|```````--'|\n" + "``````````````````````|``````|`````````|\n" + "``````````````````````|``````|`````````|\n" + "``````````````````````|``````|`````````|\n" + "``````````````````````|``````|`````````|\n" + "``````````````````````|``````|`````````|\n" + "``````````````````````|``````|`````````|\n" + "``````````````````````)`-.___|`````````|\n" + "````````````````````.'`-.____)`-.___.-'(\n" + "``````````````````.'````````.'-._____.-i\n" + "`````````````````/````````.'```````````|"),

    )