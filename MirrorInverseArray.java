public class MirrorInverseArray {

	static boolean isMirrorInverse(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {
			if (arr[arr[i]] != i)
				return false;
		}

		return true;
	}

	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 3, 0 };
		if (isMirrorInverse(arr))
			System.out.println("Yes, the array is a mirror inverse");
		else
			System.out.println("No, the array is not mirror inverse");
	}
}
