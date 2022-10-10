package com.aet.firstST.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aet.firstST.dao.UserInfoMapper;
import com.aet.firstST.dto.UserAddRequest;
import com.aet.firstST.dto.UserSearchRequest;
import com.aet.firstST.dto.UserUpdateRequest;
import com.aet.firstST.entity.UserInfo;

/**
 * ユーザー情報 Service
 */
@Service
public class UserInfoService {

    /**
     * ユーザー情報 Mapper
     */
    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * ユーザー情報全件検索
     * @return 検索結果
     */
    public List<UserInfo> findAll() {
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
        return userInfoMapper.findAll();
    }
    
    
    public List<UserInfo> findAll_() {
    	List<UserInfo> ls = new ArrayList<UserInfo>();
    	
    	UserInfo userInfo = new UserInfo();
    	
    	userInfo.setAddress("大阪府");
    	userInfo.setId(123L);
    	
    	Date d = new Date();
    	userInfo.setCreateDate(d);
    	
    	userInfo.setName("山田");
    	
    	ls.add(userInfo);
    	//------------------------------------------
    	UserInfo userInfo1 = new UserInfo();
    	
    	userInfo1.setAddress("北海道");
    	userInfo1.setId(124L);
    	
    	Date d1 = new Date();
    	userInfo1.setCreateDate(d1);
    	
    	userInfo1.setName("木村");
    	
    	ls.add(userInfo1);
    	
    	
    	return ls;
    }
    
    
    
    /**
     * ユーザー情報主キー検索
     * @return 検索結果
     */
    public UserInfo findById(Long id) {
        return userInfoMapper.findById(id);
    }

    /**
     * ユーザー情報検索
     * @param userSearchRequest リクエストデータ
     * @return 検索結果
     */
    public List<UserInfo> search(UserSearchRequest userSearchRequest) {
        return userInfoMapper.search(userSearchRequest);
    }

    /**
     * ユーザ情報登録
     * @param userAddRequest リクエストデータ
     */
    public void save(UserAddRequest userAddRequest) {
        userInfoMapper.save(userAddRequest);
    }

    /**
     * ユーザ情報更新
     * @param userEditRequest リクエストデータ
     */
    public void update(UserUpdateRequest userUpdateRequest) {
        userInfoMapper.update(userUpdateRequest);
    }

    /**
     * ユーザー情報論理削除
     * @param id
     */
    public void delete(Long id) {
        userInfoMapper.delete(id);
    }
}