void main() {
  List<int> arr = [1, 2, 3, 4, 5, 6];
  int element = 5;
  int index = find_index(arr, element);

  if (index > -1) {
    print("Element $element index is $index");
  } else {
    print("Element $element not found");
  }
}

int find_index(List arr, int s_element) {
  int result = -1;
  for (int i = 0; i < arr.length; i++) {
    if (s_element == arr[i]) {
      result = i;
      break;
    }
  }
  return result;
}
