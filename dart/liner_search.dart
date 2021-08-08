void main() {
  List<int> arr = [1, 2, 3, 4, 5, 6];
  int element = 3;

  if (search_element(arr, element)) {
    print("Element $element found");
  } else {
    print("Element $element not found");
  }
}

bool search_element(List arr, int s_element) {
  bool result = false;
  for (int i = 0; i < arr.length; i++) {
    if (s_element == arr[i]) {
      result = true;
      break;
    }
  }
  return result;
}
