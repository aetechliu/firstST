package com.aet.firstST.dao;

import java.util.List;

import com.aet.firstST.dto.UserAddRequest;
import com.aet.firstST.dto.UserSearchRequest;
import com.aet.firstST.dto.UserUpdateRequest;
import com.aet.firstST.entity.UserInfo;

public class UserInfoNoDB  implements  UserInfoMapper{
	/**
     * ユーザー情報全件検索
     * @param user 検索用リクエストデータ
     * @return 検索結果
     */
    public List<UserInfo> findAll(){
    	
    	return null;
    };

    /**
     * ユーザー情報主キー検索
     * @param id 主キー
     * @return 検索結果
     */
    public UserInfo findById(Long id){
    	
    	return null;
    };

    /**
     * ユーザー情報検索
     * @param user 検索用リクエストデータ
     * @return 検索結果
     */
    public List<UserInfo> search(UserSearchRequest user){
    	
    	return null;
    };
    /**
     * ユーザー情報登録
     * @param userRequest 登録用リクエストデータ
     */
    public void save(UserAddRequest userRequest){
    	
    
    };

    /**
     * ユーザー情報更新
     * @param userUpdateRequest 更新用リクエストデータ
     */
    public void update(UserUpdateRequest userUpdateRequest){
    	
    };

    /**
     * ユーザー情報の論理削除
     * @param id ID
     */
    public void delete(Long id){
    	
    };
}
