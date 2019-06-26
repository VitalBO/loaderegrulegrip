package ru.spb.iac.toris.egrulegrip.repository;

import ru.spb.iac.toris.egrulegrip.model.Ip;
import ru.spb.iac.toris.egrulegrip.model.Ul;

public interface IEgrulEgripSvcRepository {
    int saveIpToDB(Ip ip);
    int saveUlToDB(Ul ul);
}
