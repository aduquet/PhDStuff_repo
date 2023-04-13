class ArrayCalculator:

        
    def get_average(self):
        if self.is_empty():
            return None
        else:
            total = 0
            for element in self.data:
                total += element

            return total / self.get_size()
        
    def get_sum(self):
        total = 0
        for element in self.data:
            total += element
        return total
        
    def get_first_element(self):
        if self.is_empty():
            return None
        else:
            return self.data[0]
        
    def get_last_element(self):
        if self.is_empty():
            return None
        else:
            return self.data[self.get_size() - 1]
        
    def reverse_data(self):
        start = 0
        end = self.get_size() - 1

        while start < end:

            self.data[start], self.data[end] = self.data[end], self.data[start]
            start += 1
            end -= 1
        
    def append_data(self, new_data):
        for element in new_data:
            self.data += [element]

    def sort_asc(self):
            for i in range(self.get_size()):
                for j in range(i + 1, self.get_size()):
                    if self.data[i] > self.data[j]:
                        self.data[i], self.data[j] = self.data[j], self.data[i]


       