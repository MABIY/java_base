package 十三章;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by lh on 17-8-14.
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        String[] middle = {"1499931184400",
                "1499931185566",
                "1499931348401",
                "1499931418869",
                "1499931441019",
                "1499931768495",
                "1499931778733",
                "1499931827964",
                "1499931828564",
                "1499932023368",
                "1499932157580",
                "1499932158140",
                "1499932424783",
                "1499932454943",
                "1499932548070",
                "1499932580058",
                "1499932580932",
                "1499932647670",
                "1499932697025",
                "1499932955233",
                "1499934982207",
                "1499935259694",
                "1499935271822",
                "1499935272393",
                "1499935313522",
                "1499935482550",
                "1499935599558",
                "1499935973654",
                "1499936129921",
                "1499936130498",
                "1499936235362",
                "1499936273080",
                "1499936549591",
                "1499939095219",
                "1499939227972",
                "1499939253050",
                "1499943163104",
                "1499948097852",
                "1499949174337",
                "1499997668392",
                "1499997783580",
                "1499997998373",
                "1499997998943",
                "1499998469269",
                "1499998469859",
                "1499999685392",
                "1500002919510",
                "1500002920477",
                "1500003184956",
                "1500003965851",
                "1500004160950",
                "1500004997335",
                "1500005199169",
                "1500005440476",
                "1500006035399",
                "1500007013889",
                "1500007460175",
                "1500007460769",
                "1500007612560",
                "1500008939626",
                "1500037830507",
                "1500037831281",
                "1500044541957",
                "1500044543084",
                "1500084113354",
                "1500084113995",
                "1500093198624",
                "1500093199166",
                "1500093587997",
                "1500093617924",
                "1500093746013",
                "1500097955572",
                "1500098238553",
                "1500871529469",
                "1500872603959",
                "1500952450009",
                "1500952606587",
                "1500952691646",
                "1500952747482",
                "1501837162086",
                "1501837162881",
                "1501837282094",
                "1501837429629",
                "1501837456727",
                "1501837457444",
                "1501837510751",
                "1501837586123",
                "1501837671172",
                "1501837671890",
                "1501837779687",
                "1501837781217",
                "1501837781777",
                "1501837889053",
                "1501837889631",
                "1501837912675",
                "1501838014790",
                "1501838525792",
                "1501838526610",
                "1501838572615",
                "1501838691560",
                "1501838692129",
                "1501838708460",
                "1501838935675",
                "1501838990447",
                "1501839107594",
                "1501839108168",
                "1501839398083",
                "1501839398665",
                "1501840531100",
                "1501840531686",
                "1501840685700",
                "1501840686722",
                "1501840687240",
                "1501840687916",
                "1501840756543",
                "1501840757150",
                "1501840829129",
                "1501840842342",
                "1501840854845",
                "1501840868133",
                "1501840868708",
                "1501840881142",
                "1501840971562",
                "1501840972171",
                "1501841005099",
                "1501841774432",
                "1501841775029",
                "1501844259561",
                "1501844260380",
                "1501845905463",
                "1501845941523",
                "1501845967076",
                "1501846338206",
                "1501846339973",
                "1501846340501",
                "1501846568617",
                "1501846569243",
                "1501846666816",
                "1501846667400",
                "1501846720554",
                "1501846721119",
                "1501847894360",
                "1501847894953",
                "1501847895940",
                "1501847896462",
                "1501848067898",
                "1501848068678",
                "1501848069225",
                "1501848069768",
                "1501848112633",
                "1501848113317",
                "1501848201870",
                "1501848202477",
                "1501848537097",
                "1501848537690",
                "1501848890130",
                "1501848890749",
                "1501848973150",
                "1501848973725",
                "1501848986920",
                "1501848987461",
                "1501849234623",
                "1501849235297",
                "1501849284942",
                "1501849285535",
                "1501849294029",
                "1501849308420",
                "1501849308954",
                "1501849330212",
                "1501849343406",
                "1501849358351",
                "1501849358922",
                "1501849371427",
                "1501849398488",
                "1501849399050",
                "1501849474271",
                "1501849474891",
                "1501849612205",
                "1501849612784",
                "1501849658429",
                "1501849711697",
                "1501849712319",
                "1501850115741",
                "1501850116426",
                "1501850319667",
                "1501850320231",
                "1501850637111",
                "1501851303301",
                "1501851551652",
                "1501851577699",
                "1501852547119",
                "1501852548188",
                "1501852649534",
                "1501852650096",
                "1501854955675",
                "1501854956267",
                "1501855104276",
                "1501855104822",
                "1501855182122",
                "1501855182695",
                "1501855231578",
                "1501855232141",
                "1501855443382",
                "1501855443949",
                "1501855519093",
                "1501855614213",
                "1501855614923",
                "1501856952730",
                "1501858746014",
                "1501858877140",
                "1501859024516",
                "1501859078932",
                "1501859079548",
                "1501859093250",
                "1501861053959",
                "1501888900418",
                "1501888901044",
                "1501888913251",
                "1501888913795",
                "1501889811645",
                "1501893110426",
                "1501893127359",
                "1501893127886",
                "1501896438256",
                "1501896438854",
                "1501896635329",
                "1501898192588",
                "1501898224354",
                "1501898240349",
                "1501898240915",
                "1501898443249",
                "1501898489716",
                "1501899541846",
                "1501899542388",
                "1501899589856",
                "1501899702978",
                "1501899720690",
                "1501900124063",
                "1501900183424",
                "1501900184133",
                "1501900215136",
                "1501900215685",
                "1501900234076",
                "1501900234676",
                "1501900434176",
                "1501900434835",
                "1501900792176",
                "1501901421974",
                "1501901422625",
                "1501901437797",
                "1501901438582",
                "1501901677910",
                "1501901704175",
                "1501901704749",
                "1501901719652",
                "1501901720211",
                "1501901720715",
                "1501901804336",
                "1501901804919",
                "1501901805435",
                "1501901805960",
                "1501902612102",
                "1501902612706",
                "1501902812558",
                "1501902867134",
                "1501902867684",
                "1501903521134",
                "1501903522105",
                "1501903582119",
                "1501903714885",
                "1501904932483",
                "1501905562131",
                "1501905562752",
                "1501906220605",
                "1501906221194",
                "1501906255765",
                "1501906256327",
                "1501906275651",
                "1501906276259",
                "1501906340614",
                "1501906341264",
                "1501906393978",
                "1501906394542",
                "1501906439684",
                "1501906440234",
                "1501906682072",
                "1501906682670",
                "1501906688266",
                "1501906688797",
                "1501907510930",
                "1501907860006",
                "1501907860608",
                "1501907910364",
                "1501907910940",
                "1501908763966",
                "1501908764636",
                "1501908785420",
                "1501908785990",
                "1501909491756",
                "1501909496568",
                "1501909647428",
                "1501909647977",
                "1501909720570",
                "1501909721182",
                "1501909939255",
                "1501909939847",
                "1501910054581",
                "1501910055208",
                "1501910211173",
                "1501910211786",
                "1501910316138",
                "1501910316968",
                "1501910328104",
                "1501910328703",
                "1501910570876",
                "1501910571448",
                "1501910655304",
                "1501910655867",
                "1501910799196",
                "1501910800187",
                "1501910877027",
                "1501910877935",
                "1501911270521",
                "1501911444764",
                "1501912097130",
                "1501912097750",
                "1501912100924",
                "1501913085751",
                "1501913314242",
                "1501914134536",
                "1501915435622",
                "1501915436205",
                "1501917189777",
                "1501917552664",
                "1501917553262",
                "1501917583265",
                "1501917583930",
                "1501917641410",
                "1501917691334",
                "1501917752907",
                "1501917753610",
                "1501919319221",
                "1501919420020",
                "1501919420582",
                "1501919471253",
                "1501919740858",
                "1501919741562",
                "1501920708116",
                "1501920708803",
                "1501921333572",
                "1501921334256",
                "1501922392516",
                "1501922393146",
                "1501922588216",
                "1501923273885",
                "1501923611000",
                "1501923611619",
                "1501923734832",
                "1501923735423",
                "1501927179395",
                "1501927180432",
                "1501934987364",
                "1501934988760",
                "1501935007880",
                "1501935008503",
                "1501935066094",
                "1501935067184",
                "1501935071823",
                "1501935072342",
                "1501938509654",
                "1501938652858",
                "1501940732172",
                "1501940732783",
                "1501983072453",
                "1501983150490",
                "1501988265271",
                "1501989701196",
                "1501989701789",
                "1501989810949",
                "1501989811545",
                "1501990729457",
                "1501990730078",
                "1501990803325",
                "1501990854085",
                "1501990889314",
                "1501990889885",
                "1501990965535",
                "1501990966095",
                "1501991268793",
                "1501991269419",
                "1501991643498",
                "1501991644294",
                "1501992842902",
                "1501992843464",
                "1501992856882",
                "1501992857451",
                "1501993150256",
                "1501993150808",
                "1501994598210",
                "1501994598832",
                "1501996795078",
                "1501996795887",
                "1501997705647",
                "1501997856361",
                "1501997856890",
                "1501998478848",
                "1501998479431",
                "1501998527581",
                "1501998528147",
                "1501998645790",
                "1501998646343",
                "1501998679436",
                "1501998679972",
                "1502005794750",
                "1502005795383",
                "1502005890774",
                "1502005891370",
                "1502005898763",
                "1502005899312",
                "1502006041741",
                "1502006042294",
                "1502006104494",
                "1502006105064",
                "1502006134880",
                "1502006135415",
                "1502006218961",
                "1502006219575",
                "1502006245929",
                "1502006246657",
                "1502006398661",
                "1502006399228",
                "1502006421418",
                "1502006422381",
                "1502006519826",
                "1502006520390",
                "1502011526144",
                "1502011526967",
                "1502011551300",
                "1502011552497",
                "1502014660912",
                "1502014799627",
                "1502015066266",
                "1502015112131",
                "1502015112723",
                "1502023575090",
                "1502026479862",
                "1502027994572",
                "1502062819342",
                "1502062820149",
                "1502062820722",
                "1502062869049",
                "1502070749961",
                "1502070750609",
                "1502070751147",
                "1502071314107",
                "1502071439786",
                "1502071440342",
                "1502071810641",
                "1502071811330",
                "1502071901202",
                "1502071901768",
                "1502072100546",
                "1502072101110",
                "1502072998320",
                "1502072999943",
                "1502073000581",
                "1502073040456",
                "1502073041021",
                "1502073413602",
                "1502073414188",
                "1502073414753",
                "1502073512255",
                "1502073618329",
                "1502073618957",
                "1502073746679",
                "1502073747348",
                "1502073877360",
                "1502073877949",
                "1502073907894",
                "1502073908473",
                "1502074211283",
                "1502074211855",
                "1502074212358",
                "1502074816699",
                "1502074868849",
                "1502075183497",
                "1502075184088",
                "1502075206983",
                "1502075207582",
                "1502075208162",
                "1502075545168",
                "1502075545795",
                "1502075694470",
                "1502075695157",
                "1502075771616",
                "1502075889823",
                "1502075970385",
                "1502077045775",
                "1502077046327",
                "1502077534581",
                "1502077535145",
                "1502077917886",
                "1502077989774",
                "1502077990340",
                "1502077998955",
                "1502078033296",
                "1502078033871",
                "1502078990816",
                "1502078991426",
                "1502079020641",
                "1502079191098",
                "1502079229060",
                "1502079266301",
                "1502079266890",
                "1502079267436",
                "1502079647161",
                "1502079647741",
                "1502079648289",
                "1502079939941",

        };
        Set<String> list = new HashSet<>(Arrays.asList(middle));
        Set<String> m = new HashSet<>();

        Scanner scanner = new Scanner(new File("/home/lh/IdeaProjects/java_base/java编程思想/src/十三章/1.txt"));
        while (scanner.hasNext()) {
            String tmp = scanner.next();
            if (list.contains(tmp)) {

            } else {
                m.add(tmp);
            }
        }
        System.out.printf("number: %d",m.size());
        System.out.println(Arrays.toString(m.toArray()));
        System.out.printf("middle: %d",middle.length);

    }
}
