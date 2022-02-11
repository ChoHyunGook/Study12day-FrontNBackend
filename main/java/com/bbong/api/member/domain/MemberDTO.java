package com.bbong.api.member.domain;

/**
 * packageName: com.bbong.api.buy.domain
 * fileName        : MemberDTO
 * author           : chohyungook
 * date               : 2022-02-11
 * desc            :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-11         chohyungook        최초 생성
 */
public class MemberDTO {

    private String id;
    private String name;
    private int numberr;
    private String addr;
    private String phone1;
    private String phone2;
    private int height;
    private String debutDate;


    public final static MemberDTO memberDTO=new MemberDTO();
    private MemberDTO(){}
    public static MemberDTO getInstance(){return memberDTO;}


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberr() {
        return numberr;
    }

    public void setNumberr(int numberr) {
        this.numberr = numberr;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getDebutDate() {
        return debutDate;
    }

    public void setDebutDate(String debutDate) {
        this.debutDate = debutDate;
    }
}
