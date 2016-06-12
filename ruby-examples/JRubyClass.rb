class Play

def initialize(value)
  @val = value
end

def set(value)
  @val = value
end

def get(value)
  return @val
end

def to_s 
  return "Play    " + @val.to_s
end


test = Play.new(100)
p test

end
