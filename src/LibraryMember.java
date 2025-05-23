class LibraryMember {
    private String name;
    private int MembershipId;

    public LibraryMember(String name, int MembershipId) {
        this.name = name;
        this.MembershipId = MembershipId;

    }

    public String getMemberInfo() {
        return " Название : " + name + ", Id: " + MembershipId;

    }
}
