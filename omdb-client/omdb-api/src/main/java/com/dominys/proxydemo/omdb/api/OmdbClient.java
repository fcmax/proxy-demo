package com.dominys.proxydemo.omdb.api;

import com.dominys.proxydemo.common.router.api.annotation.ForceProxyVersion;
import com.dominys.proxydemo.omdb.api.dto.*;

import java.util.List;

public interface OmdbClient {

    OmdbApiSearchResponse<List<SimpleMovie>> searchMovies(User user, String title, int page);





















































    @ForceProxyVersion(SupportedClientVersion.Versions.VERSION_2)
    OmdbApiResponse<OmdbMovie> searchByImdbId(String imdbId);
}
