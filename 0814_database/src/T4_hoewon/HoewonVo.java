package T4_hoewon;

public class HoewonVo {
  private int idx;
  private String hid,pwd,name,gender,job,address,joinday;
  
  public int getIdx() {
    return idx;
  }
  public void setIdx(int idx) {
    this.idx = idx;
  }
  public String getHid() {
    return hid;
  }
  public void setHid(String hid) {
    this.hid = hid;
  }
  public String getPwd() {
    return pwd;
  }
  public void setPwd(String pwd) {
    this.pwd = pwd;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getGender() {
    return gender;
  }
  public void setGender(String gender) {
    this.gender = gender;
  }
  public String getJob() {
    return job;
  }
  public void setJob(String job) {
    this.job = job;
  }
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }
  public String getJoinday() {
    return joinday;
  }
  public void setJoinday(String joinday) {
    this.joinday = joinday;
  }
  
  @Override
  public String toString() {
    return "HoewonVo [idx=" + idx + ", hid=" + hid + ", pwd=" + pwd + ", name=" + name + ", gender=" + gender + ", job="
        + job + ", address=" + address + ", joinday=" + joinday + "]";
  }
  
}
