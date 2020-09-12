package CourierService;

public class CourierSaveVo {
  private int idx;
  private String state;
  private int customer_idx;
  private String customer_name;
  
  public int getIdx() {
    return idx;
  }
  public void setIdx(int idx) {
    this.idx = idx;
  }
  public String getState() {
    return state;
  }
  public void setState(String state) {
    this.state = state;
  }
  public int getCustomer_idx() {
    return customer_idx;
  }
  public void setCustomer_idx(int customer_idx) {
    this.customer_idx = customer_idx;
  }
  public String getCustomer_name() {
    return customer_name;
  }
  public void setCustomer_name(String customer_name) {
    this.customer_name = customer_name;
  }
  
  @Override
  public String toString() {
    return "CourierSaveVo [idx=" + idx + ", state=" + state + ", customer_idx=" + customer_idx + ", customer_name="
        + customer_name + "]";
  }
}
