package CourierService;

public class CourierVo {
  private int idx;
  private String part, arrival, product, receive, send;
  private int cost,save_idx;
  private String bigo;
  
  public int getIdx() {
    return idx;
  }
  public void setIdx(int idx) {
    this.idx = idx;
  }
  public String getPart() {
    return part;
  }
  public void setPart(String part) {
    this.part = part;
  }
  public String getArrival() {
    return arrival;
  }
  public void setArrival(String arrival) {
    this.arrival = arrival;
  }
  public String getProduct() {
    return product;
  }
  public void setProduct(String product) {
    this.product = product;
  }
  public String getReceive() {
    return receive;
  }
  public void setReceive(String receive) {
    this.receive = receive;
  }
  public String getSend() {
    return send;
  }
  public void setSend(String send) {
    this.send = send;
  }
  public int getCost() {
    return cost;
  }
  public void setCost(int cost) {
    this.cost = cost;
  }
  public String getBigo() {
    return bigo;
  }
  public void setBigo(String bigo) {
    this.bigo = bigo;
  }
  public int getSave_idx() {
    return save_idx;
  }
  public void setSave_idx(int save_idx) {
    this.save_idx = save_idx;
  }
  @Override
  public String toString() {
    return "CourierVo [idx=" + idx + ", part=" + part + ", arrival=" + arrival + ", product=" + product + ", receive="
        + receive + ", send=" + send + ", cost=" + cost + ", save_idx=" + save_idx + ", bigo=" + bigo + "]";
  }
}
