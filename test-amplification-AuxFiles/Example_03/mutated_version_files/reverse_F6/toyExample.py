class ToyExample:
    def __init__(self, data):
        self.data = data
    
    # Methods that modify the object state
    def set_data(self, new_data):
        self.data = new_data
    
    def reverse_data(self):
        n = self.get_size()
        for i in range(n // 2):
            # self.data[i], self.data[n-i-1] = self.data[n-i-1], self.data[i]
            self.data[i], self.data[n-i-1] = self.data[(n+i)-1], self.data[i]

    def sort_ascending(self):
        n = len(self.data)
        for i in range(n):
            for j in range(i+1, n):
                if self.data[i] > self.data[j]:
                    self.data[i], self.data[j] = self.data[j], self.data[i]
    
    def remove_duplicates(self):
        n = len(self.data)
        unique_data = []
        for i in range(n):
            if self.data[i] not in unique_data:
                unique_data.append(self.data[i])
        
        if unique_data != self.data :
            self.data = unique_data
            self.sort_ascending()
            # self.set_data()
        else:
            self.data = unique_data
            # self.sort_ascending()

    
    def append_data(self, new_element):
        self.data += [new_element]

    def multiply_by_scalar(self, scalar):
        n = len(self.data)
        for i in range(n):
            self.data[i] *= scalar

    # Methods that inspect the object state
    def get_max(self):
        n = self.get_size()
        if (n != 0):
            max_element = self.data[0]
            for i in range(1, n):
                if self.data[i] > max_element:
                    max_element = self.data[i]
            return max_element
        else:
            None

    def get_min(self):
        n = self.get_size()
        if (n != 0):
            min_element = self.data[0]
            for i in range(1, n):
                if self.data[i] <= min_element:
                    min_element = self.data[i]
            return min_element
        else:
            None
    
    
    def check_last(self):
        n = len(self.data)
        if n > 0:
            return self.data[n-1]
        else:
            return None
    
    def check_first(self):
        if len(self.data) > 0:
            return self.data[0]
        else:
            return None
    
    def get_size(self):
        return len(self.data)
    
    def is_empty(self):
        if self.get_size() == 0:
            return True
        else:
            return False
    
    def is_sorted(self):
        n = len(self.data)
        if n == 0:
            return True
        for i in range(n-1):
            if self.data[i] > self.data[i+1]:
                return False
        return True

    # Methods that perform operations with the object but don't modify it
    
    def calculate_sum(self):
        sum_data = 0
        n = len(self.data)
        for i in range(n):
            sum_data += self.data[i]
        return sum_data
    
    def get_average(self):
        n = len(self.data)
        if n == 0:
            return None
        else:
            return sum(self.data) / n

