package com.alm.system.service;

import javax.servlet.http.HttpSession;

/**
 * Created by IntelliJ IDEA.
 * <p>user: LISHUAI</p>
 * <p>date: 2019-01-10 19:32</p>
 * <p>desc: </p>
 */
public interface CommService {

    /**
     * session更新user
     *
     * @param id
     */
    void sessionUpdateUser(HttpSession session, Long id);

    /**
     * session更新user
     *
     * @param acc
     */
    void sessionUpdateUser(HttpSession session, String acc);
}
