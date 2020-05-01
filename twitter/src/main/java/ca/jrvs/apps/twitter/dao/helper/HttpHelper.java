package ca.jrvs.apps.twitter.dao.helper;

import java.io.IOException;
import java.net.URI;

import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import org.apache.http.HttpResponse;
import org.apache.http.entity.StringEntity;

public interface HttpHelper {

    /**
     * Execute a HTTP Post call
     * @param uri
     * @return
     */
    HttpResponse httpPost(URI uri) throws OAuthCommunicationException, OAuthExpectationFailedException, OAuthMessageSignerException, IOException;

    /**
     * Execute a HTTP Get call
     * @param uri
     * @return
     */
    HttpResponse httpGet(URI uri) throws OAuthCommunicationException, OAuthExpectationFailedException, OAuthMessageSignerException, IOException;
}