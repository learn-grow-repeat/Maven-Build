package com.api.insuredassurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.insuredassurance.dao.ClaimDao;
import com.api.insuredassurance.dto.Claim;
@Service
public class ClaimService {

    @Autowired
    ClaimDao dao;
    @Autowired
    InsurancePolicyDao policyDao;
    public Claim insertClaim(Claim claim) { // policy id db exist    fetch db data of policy  set in passed claim
       return dao.insertClaim(claim);
    }
    public Claim updateClaim(int id, Claim claim) {
        return dao.updateClaim(id, claim);
    }
    public void deleteClaim(int id){
        dao.deleteClaim(id);
    }
    public List<Claim> getAllClaims(){
        return dao.getAllClaims();
    }
    public Claim getClaim(int id){
        return dao.getClaim(id);
    }
}
