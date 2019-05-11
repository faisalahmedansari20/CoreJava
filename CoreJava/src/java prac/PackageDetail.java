class PackageDetail
{
    public static void main(String[] args)
	{
		Package p=Package.getPackage("java.lang");
		System.out.println("package name "+p.getName());


	}
}
