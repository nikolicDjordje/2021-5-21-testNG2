package bankaDom;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestBankaKod {

	 

		@Test
		public void proveraKonstruktora () {
			BankaKod bk = new BankaKod("Djordje", "123-456");
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(bk.dohvatiIme(), "Djordje");
			sa.assertEquals(bk.dohvatiZiroRacun(), "123-456");
			sa.assertEquals(bk.dohvatiIznos(), 0.0);
		}
		@Test
		public void proveraGetera () {
			BankaKod bk = new BankaKod("Kaca", "456-123");
			SoftAssert sa = new SoftAssert();
			sa.assertEquals(bk.dohvatiIme(), "Kaca");
			sa.assertEquals(bk.dohvatiZiroRacun(), "456-123");
			sa.assertEquals(bk.dohvatiIznos(), 0.0);
		}
	}


