void main() {
  int result;
  List<int> arr = [1, 2, 3, 4, 5, 6, 7, 8];
  int search_element = 4;
  result = binary_search(arr, search_element);
  if (result != -1) {
    print("Element $search_element found on index $result");
  } else {
    print("Element not found");
  }
}

int binary_search(List arr, int search) {
  int heigh = arr.length;
  int low = 0;
  int mid;
  int index_result = -1;

  while (low < heigh) {
    mid = ((heigh + low) / 2).floor();

    if (search == arr[mid]) {
      index_result = mid;
      break;
    } else if (search < arr[mid]) {
      heigh = mid;
    } else if (search > arr[mid]) {
      low = mid;
    }
  }

  return index_result;
}
